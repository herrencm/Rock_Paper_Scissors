public class RockPaperScissorsRunner {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RockPaperScissorsFrame frame = new RockPaperScissorsFrame();
                frame.setVisible(true);
            }
        });
    }
}