import javax.swing.JFrame;

public class Game_frame extends JFrame{

	Game_frame () {
				
		this.add(new Game_Panel());
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	
	}
}
