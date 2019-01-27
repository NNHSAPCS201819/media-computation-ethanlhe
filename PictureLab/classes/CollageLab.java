
/**
 * Write a description of class CollageLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollageLab
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CollageLab
     */
    public CollageLab()
        Picture canvas = new Picture(749,1245);
        
        Picture pic = new Picture("icosfera.jpg");
        canvas.cropAndCopy(pic, 0, 374, 0, 622,0 ,0 );
        
        Picture pic2 = new Picture("icosfera.jpg");
        pic2.mirrorHorizontal();
        canvas.cropAndCopy(pic2, 0, 374, 0, 622, 374, 0);
        
        Picture pic3 = new Picture("icosfera.jpg");
        pic3.mirrorHorizontalBotToTop();
        canvas.cropAndCopy(pic3, 0, 374, 0, 622, 0, 622);
        
        Picture pic4 = new Picture("icosfera.jpg");
        pic4.grayScale();
        canvas.cropAndCopy(pic4, 0, 374, 0, 622, 374, 622);
        
       
        canvas.explore();
    }
}
