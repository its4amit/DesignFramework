package practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageHandeling {

	
	public static void main(String[] args) {

		try {

			URL url = new URL("https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg"); // path
																												// for
																												// image
																												// from
																												// url

//			File file = new File(""); // path from local drive where image is stored

			BufferedImage image = ImageIO.read(url);

			ImageIO.write(image, "jpg", new File("./Images/bag.jpg"));
			ImageIO.write(image, "bmp", new File("./Images/bag.bmp"));
			ImageIO.write(image, "png", new File("./Images/bag.png"));
			ImageIO.write(image, "gif", new File("./Images/bag.gif"));

		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Done....");

	}

}
