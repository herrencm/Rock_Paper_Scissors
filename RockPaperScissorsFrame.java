import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RockPaperScissorsFrame extends JFrame {

    private JPanel buttonPanel;
    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JButton quitButton;
    private JPanel statsPanel;
    private JLabel playerWinsLabel;
    private JTextField playerWinsField;
    private JLabel computerWinsLabel;
    private JTextField computerWinsField;
    private JLabel tiesLabel;
    private JTextField tiesField;
    private JScrollPane resultsScrollPane;
    private JTextArea resultsTextArea;
    private int playerWins;
    private int computerWins;
    private int ties;
    private String lastPlayerMove;
    private String lastComputerMove;

    public RockPaperScissorsFrame() {
        super("Rock Paper Scissors Game");

        rockButton = new JButton(new ImageIcon("src/rock.png"));
        paperButton = new JButton(new ImageIcon("src/paper.png"));
        scissorsButton = new JButton(new ImageIcon("src/scissors.png"));
        quitButton = new JButton("Quit");
        buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createTitledBorder("Select Move"));
        buttonPanel.add(rockButton);
        buttonPanel.add(paperButton);
        buttonPanel.add(scissorsButton);
        buttonPanel.add(quitButton);

        playerWinsLabel = new JLabel("Player Wins:");
        playerWinsField = new JTextField(5);
        playerWinsField.setEditable(false);
        computerWinsLabel = new JLabel("Computer Wins:");
        computerWinsField = new JTextField(5);
        computerWinsField.setEditable(false);
        tiesLabel = new JLabel("Ties:");
        tiesField = new JTextField(5);
        tiesField.setEditable(false);
        statsPanel = new JPanel();
        statsPanel.setBorder(BorderFactory.createTitledBorder("Stats"));
        statsPanel.add(playerWinsLabel);
        statsPanel.add(playerWinsField);
        statsPanel.add(computerWinsLabel);
        statsPanel.add(computerWinsField);
        statsPanel.add(tiesLabel);
        statsPanel.add(tiesField);

        resultsTextArea = new JTextArea(10, 30);
        resultsTextArea.setEditable(false);
        resultsScrollPane = new JScrollPane(resultsTextArea);
        resultsScrollPane.setBorder(BorderFactory.createTitledBorder("Results"));

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(statsPanel, BorderLayout.CENTER);
        add(resultsScrollPane, BorderLayout.SOUTH);

        rockButton.addActionListener(new MoveListener("Rock"));
        paperButton.addActionListener(new MoveListener("Paper"));
        scissorsButton.addActionListener(new MoveListener("Scissors"));
        quitButton.addActionListener((ActionEvent ae) -> System.exit(0));

        playerWins = 0;
        computerWins = 0;
        ties = 0;
        lastPlayerMove = "";
        lastComputerMove = "";

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateStats() {
        playerWinsField.setText(Integer.toString(playerWins));
        computerWinsField.setText(Integer.toString(computerWins));
        tiesField.setText(Integer.toString(ties));
    }

    private class MoveListener implements ActionListener {
        private String playerMove;

        public MoveListener(String move) {
            playerMove = move;
        }

        public void actionPerformed(ActionEvent event) {
        }
    }
}