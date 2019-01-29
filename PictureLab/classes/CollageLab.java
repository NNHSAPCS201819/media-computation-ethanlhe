
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
    {
        Picture total = new Picture(749,1245);
        
        Picture pic = new Picture("icosfera.jpg");
        total.cropAndCopy(pic, 0, 374, 0, 622,0 ,0 );
        
        Picture pic2 = new Picture("icosfera.jpg");
        pic2.mirrorVerticalRightToLeft();
        total.cropAndCopy(pic2, 0, 374, 0, 622, 374, 0);
        
        Picture pic3 = new Picture("icosfera.jpg");
        pic3.mirrorHorizontalBotToTop();
        total.cropAndCopy(pic3, 0, 374, 0, 622, 0, 622);
        
        Picture pic4 = new Picture("icosfera.jpg");
        pic4.grayScale();
        total.cropAndCopy(pic4, 0, 374, 0, 622, 374, 622);
        
        
        total.explore();
        total.write("Ethan_He.jpg");
    }
}
