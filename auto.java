import java.io.IOException;
import java.net.InetAddress;

public class auto {
    private static final String CONNECTION_NAME = "你的宽带连接名称"; // 替换为你的宽带连接名称
    private static final String USERNAME = "你的用户名"; // 替换为你的用户名
    private static final String PASSWORD = "你的密码"; // 替换为你的密码

    public static void main(String[] args) {
        while (true) {
            if (!isConnected()) {
                System.out.println("001");
                dialUp();
            } else {
                System.out.println("000");
            }
            try {
                Thread.sleep(1000); // 每30秒检查一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isConnected() {
        try {
            // 尝试连接到一个公共DNS服务器（例如Google的8.8.8.8）
            InetAddress address = InetAddress.getByName("8.8.8.8");
            return !address.equals("");
        } catch (IOException e) {
            return false;
        }
    }

    private static void dialUp() {
        try {
            String command = "rasdial \"" + CONNECTION_NAME + "\" " + USERNAME + " " + PASSWORD;
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            System.out.println("111");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("222");
        }
    }
}