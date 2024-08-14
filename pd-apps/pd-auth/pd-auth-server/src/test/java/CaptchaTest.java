import com.wf.captcha.ChineseCaptcha;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @description:
 * @projectName:pd
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/8/12 20:26
 * @version:1.0
 */
public class CaptchaTest {
    public static void main(String[] args) throws FileNotFoundException {
        ChineseCaptcha chineseCaptcha = new ChineseCaptcha();
        String text = chineseCaptcha.text();
        System.out.println(text);
        chineseCaptcha.out(new FileOutputStream("D:\\test.png"));


    }
}
