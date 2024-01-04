
package com.bella.utilities;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import com.StepDefinitions.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotCapture {

	public void fullPageScreenshot() throws IOException {

		Date date = new Date();
		String dateFormat = date.toString().replace(" ", "-").replace(":", "-");
		AShot ashot = new AShot();

		BufferedImage image = ashot.shootingStrategy(ShootingStrategies.viewportPasting(3000))
				.takeScreenshot(TestBase.getDriver()).getImage();
		String baseDir = System.getProperty("user.dir");

		ImageIO.write(image, "jpg",
				new File(baseDir + "/src/main/resources/FailedTestScreenShots" + dateFormat + "failedTC.jpg"));

	}
}
