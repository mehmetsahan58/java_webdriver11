package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test

    public void testFileUpload () {

        var uploadPage = homePage.clickFileUpload();

        uploadPage.uploadFile("C:\\Users\\Mehmet Sahan\\Desktop\\chromedriver_win32");

        assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe", "The file is incorrect");

    }
}
