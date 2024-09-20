package printingInJava;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.PrintStream;


class MultiProcessor extends  Thread
{

    String url;
    public MultiProcessor(String url)
    {
        this.url = url;
    }

    @Override
    public void run() {

        try
        {
            File file = new File(url);
            AudioInputStream ais = AudioSystem.getAudioInputStream(file);
//        ais.skip(ais.getFrameLength()*2);

            Clip clip = AudioSystem.getClip();
            clip.open(ais);
//        clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

            PrintStream out = new PrintStream(new File("C:\\Users\\root\\Desktop\\coreJavaMastery\\data.log"));
            while (clip.isActive())
            {

            }
        }catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }

    }
}

public class Example12 {
    public static void main(String[] args){

        MultiProcessor obj1 = new MultiProcessor("C:\\Users\\root\\Downloads\\song.wav");
        MultiProcessor obj2 = new MultiProcessor("C:\\Users\\root\\Downloads\\song.wav");
        MultiProcessor obj3 = new MultiProcessor("C:\\Users\\root\\Downloads\\song.wav");
        MultiProcessor obj4 = new MultiProcessor("C:\\Users\\root\\Downloads\\HONEY.wav");

        obj4.setPriority(Thread.MAX_PRIORITY);
        obj4.start();
        obj1.start();
        obj2.start();
        obj3.start();

    }
}
