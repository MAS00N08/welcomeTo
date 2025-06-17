package welcomeTo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;


public class WelcomeTo {
	static String mode = "None";
	static ArrayList<JTextField> fields = new ArrayList<JTextField>();
	static ArrayList<JLabel> labels = new ArrayList<JLabel>();
	static ImageIcon ecks = new ImageIcon("images/Untitled.png");
	static ImageIcon flence = new ImageIcon("images/fences.png");
	public static void main(String[] args) {
		
		ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
		images.add(new ImageIcon("cards/1_Fence.png"));
		images.add(new ImageIcon("cards/1_Market.png"));
		images.add(new ImageIcon("cards/1_Park.png"));
		images.add(new ImageIcon("cards/10_Construction.png"));
		images.add(new ImageIcon("cards/10_Fence.png"));
		images.add(new ImageIcon("cards/10_Pool.png"));
		images.add(new ImageIcon("cards/10D_Fence.png"));
		images.add(new ImageIcon("cards/11_Fence.png"));
		images.add(new ImageIcon("cards/11_Market.png"));
		images.add(new ImageIcon("cards/11_Park.png"));
		images.add(new ImageIcon("cards/11D_Fence.png"));
		images.add(new ImageIcon("cards/11D_Market.png"));
		images.add(new ImageIcon("cards/12_Construction.png"));
		images.add(new ImageIcon("cards/12_Market.png"));
		images.add(new ImageIcon("cards/12_Park.png"));
		images.add(new ImageIcon("cards/13_Bis.png"));
		images.add(new ImageIcon("cards/13_Construction.png"));
		images.add(new ImageIcon("cards/13_Fence.png"));
		images.add(new ImageIcon("cards/13_Pool.png"));
		images.add(new ImageIcon("cards/14_Fence.png"));
		images.add(new ImageIcon("cards/14_Market.png"));
		images.add(new ImageIcon("cards/14_Park.png"));
		images.add(new ImageIcon("cards/15_Fence.png"));
		images.add(new ImageIcon("cards/15_Market.png"));
		images.add(new ImageIcon("cards/15_Park.png"));
		images.add(new ImageIcon("cards/2_Fence.png"));
		images.add(new ImageIcon("cards/2_Market.png"));
		images.add(new ImageIcon("cards/2_Park.png"));
		images.add(new ImageIcon("cards/3_Bis.png"));
		images.add(new ImageIcon("cards/3_Construction.png"));
		images.add(new ImageIcon("cards/3_Fence.png"));
		images.add(new ImageIcon("cards/3_Pool.png"));
		images.add(new ImageIcon("cards/4_Bis.png"));
		images.add(new ImageIcon("cards/4_Construction.png"));
		images.add(new ImageIcon("cards/4_Market.png"));
		images.add(new ImageIcon("cards/4_Park.png"));
		images.add(new ImageIcon("cards/4_Pool.png"));
		images.add(new ImageIcon("cards/5_Fence.png"));
		images.add(new ImageIcon("cards/5_Market.png"));
		images.add(new ImageIcon("cards/5_Park.png"));
		images.add(new ImageIcon("cards/5D_fence.png"));
		images.add(new ImageIcon("cards/5D_Market.png"));
		images.add(new ImageIcon("cards/5D_Park.png"));
		images.add(new ImageIcon("cards/6_Bis.png"));
		images.add(new ImageIcon("cards/6_Construction.png"));
		images.add(new ImageIcon("cards/6_Fence.png"));
		images.add(new ImageIcon("cards/6_Market.png"));
		images.add(new ImageIcon("cards/6_Park.png"));
		images.add(new ImageIcon("cards/6_Pool.png"));
		images.add(new ImageIcon("cards/6D_Fence.png"));
		images.add(new ImageIcon("cards/7_Construction.png"));
		images.add(new ImageIcon("cards/7_Fence.png"));
		images.add(new ImageIcon("cards/7_Market.png"));
		images.add(new ImageIcon("cards/7_Market (2).png"));
		images.add(new ImageIcon("cards/7_Park.png"));
		images.add(new ImageIcon("cards/7_Park (2).png"));
		images.add(new ImageIcon("cards/7_Pool.png"));
		images.add(new ImageIcon("cards/8_Bis.png"));
		images.add(new ImageIcon("cards/8_Construction.png"));
		images.add(new ImageIcon("cards/8_Fence.png"));
		images.add(new ImageIcon("cards/8_Market.png"));
		images.add(new ImageIcon("cards/8_Park.png"));
		images.add(new ImageIcon("cards/8_Pool.png"));
		images.add(new ImageIcon("cards/8D_fence.png"));
		images.add(new ImageIcon("cards/8D_Market.png"));
		images.add(new ImageIcon("cards/8D_Park.png"));
		images.add(new ImageIcon("cards/9_Construction.png"));
		images.add(new ImageIcon("cards/9_Fence.png"));
		images.add(new ImageIcon("cards/9_Market.png"));
		images.add(new ImageIcon("cards/9_Park.png"));
		images.add(new ImageIcon("cards/9D_Park.png"));
		images.add(new ImageIcon("cards/B_Bis.png"));
		images.add(new ImageIcon("cards/B_Construction.png"));
		images.add(new ImageIcon("cards/B_Fence.png"));
		images.add(new ImageIcon("cards/B_Market.png"));
		images.add(new ImageIcon("cards/B_Park.png"));
		images.add(new ImageIcon("cards/B_Pool.png"));
		
		 System.out.println(images.size());
		ArrayList<Card> deck = new ArrayList<Card>();
		deck.add(new Card(images.get(0), images.get(images.size() - 4)));
		deck.add(new Card(images.get(1), images.get(images.size() - 3)));
		deck.add(new Card(images.get(2), images.get(images.size() - 2)));
		deck.add(new Card(images.get(3), images.get(images.size() - 5)));
		deck.add(new Card(images.get(4), images.get(images.size() - 4)));
		deck.add(new Card(images.get(5), images.get(images.size() - 1)));
		deck.add(new Card(images.get(6), images.get(images.size() - 4)));
		deck.add(new Card(images.get(7), images.get(images.size() - 4)));
		deck.add(new Card(images.get(8), images.get(images.size() - 3)));
		deck.add(new Card(images.get(9), images.get(images.size() - 2)));
		deck.add(new Card(images.get(10), images.get(images.size() - 4)));
		deck.add(new Card(images.get(11), images.get(images.size() - 3)));
		deck.add(new Card(images.get(12), images.get(images.size() - 5)));
		deck.add(new Card(images.get(13), images.get(images.size() - 3)));
		deck.add(new Card(images.get(14), images.get(images.size() - 2)));
		deck.add(new Card(images.get(15), images.get(images.size() - 6)));
		deck.add(new Card(images.get(16), images.get(images.size() - 5)));
		deck.add(new Card(images.get(17), images.get(images.size() - 4)));
		deck.add(new Card(images.get(18), images.get(images.size() - 1)));
		deck.add(new Card(images.get(19), images.get(images.size() - 4)));
		deck.add(new Card(images.get(20), images.get(images.size() - 3)));
		deck.add(new Card(images.get(21), images.get(images.size() - 2)));
		deck.add(new Card(images.get(22), images.get(images.size() - 4)));
		deck.add(new Card(images.get(23), images.get(images.size() - 3)));
		deck.add(new Card(images.get(24), images.get(images.size() - 2)));
		deck.add(new Card(images.get(25), images.get(images.size() - 4)));
		deck.add(new Card(images.get(26), images.get(images.size() - 3)));
		deck.add(new Card(images.get(27), images.get(images.size() - 2)));
		deck.add(new Card(images.get(28), images.get(images.size() - 6)));
		deck.add(new Card(images.get(29), images.get(images.size() - 5)));
		deck.add(new Card(images.get(30), images.get(images.size() - 4)));
		deck.add(new Card(images.get(31), images.get(images.size() - 2)));
		deck.add(new Card(images.get(32), images.get(images.size() - 6)));
		deck.add(new Card(images.get(33), images.get(images.size() - 5)));
		deck.add(new Card(images.get(34), images.get(images.size() - 3)));
		deck.add(new Card(images.get(35), images.get(images.size() - 2)));
		deck.add(new Card(images.get(36), images.get(images.size() - 1)));
		deck.add(new Card(images.get(37), images.get(images.size() - 4)));
		deck.add(new Card(images.get(38), images.get(images.size() - 3)));
		deck.add(new Card(images.get(39), images.get(images.size() - 2)));
		deck.add(new Card(images.get(40), images.get(images.size() - 4)));
		deck.add(new Card(images.get(41), images.get(images.size() - 3)));
		deck.add(new Card(images.get(42), images.get(images.size() - 2)));
		deck.add(new Card(images.get(43), images.get(images.size() - 6)));
		deck.add(new Card(images.get(44), images.get(images.size() - 5)));
		deck.add(new Card(images.get(45), images.get(images.size() - 4)));
		deck.add(new Card(images.get(46), images.get(images.size() - 3)));
		deck.add(new Card(images.get(47), images.get(images.size() - 2)));
		deck.add(new Card(images.get(48), images.get(images.size() - 1)));
		deck.add(new Card(images.get(49), images.get(images.size() - 4)));
		deck.add(new Card(images.get(50), images.get(images.size() - 5)));
		deck.add(new Card(images.get(51), images.get(images.size() - 4)));
		deck.add(new Card(images.get(52), images.get(images.size() - 3)));
		deck.add(new Card(images.get(53), images.get(images.size() - 3)));
		deck.add(new Card(images.get(54), images.get(images.size() - 2)));
		deck.add(new Card(images.get(55), images.get(images.size() - 2)));
		deck.add(new Card(images.get(56), images.get(images.size() - 1)));
		deck.add(new Card(images.get(57), images.get(images.size() - 6)));
		deck.add(new Card(images.get(58), images.get(images.size() - 5)));
		deck.add(new Card(images.get(59), images.get(images.size() - 4)));
		deck.add(new Card(images.get(60), images.get(images.size() - 3)));
		deck.add(new Card(images.get(61), images.get(images.size() - 2)));
		deck.add(new Card(images.get(62), images.get(images.size() - 1)));
		deck.add(new Card(images.get(63), images.get(images.size() - 4)));
		deck.add(new Card(images.get(64), images.get(images.size() - 3)));
		deck.add(new Card(images.get(65), images.get(images.size() - 2)));
		deck.add(new Card(images.get(66), images.get(images.size() - 5)));
		deck.add(new Card(images.get(67), images.get(images.size() - 4)));
		deck.add(new Card(images.get(68), images.get(images.size() - 3)));
		deck.add(new Card(images.get(69), images.get(images.size() - 2)));
		deck.add(new Card(images.get(70), images.get(images.size() - 2)));
		deck.add(new Card(images.get(71), images.get(images.size() - 3)));
		
		ArrayList<Card> deckTake = new ArrayList<Card>();
		for(int i = 0; i < deck.size(); i++) {
			deckTake.add(deck.get(i));
		}
		
		ArrayList<Card> deck1 = new ArrayList<Card>();
		ArrayList<Card> deck2 = new ArrayList<Card>();
		ArrayList<Card> deck3 = new ArrayList<Card>();
		ArrayList<Integer> picked = new ArrayList<Integer>();
		
		for(int i = 1; i <= deckTake.size(); i++) {
			boolean check = false;
			int index = (int) (Math.random() * (deckTake.size()));
			if(i % 3 == 1) {
				deck1.add(deckTake.remove(index));
			}
			else if(i % 3 == 2) {
				deck2.add(deckTake.remove(index));
			}
			else {
				deck3.add(deckTake.remove(index));
			}
		}
			
		
		
		ImageIcon board  = new ImageIcon("images/welcometo.jpg");
		JFrame frame = new JFrame("Game");
		frame.setLayout(new BorderLayout(0,0));
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JFrame frame2 = new JFrame("Buttons");
		frame2.setLayout(new BorderLayout(0,0));
		frame2.setSize(200, 400);
		frame2.setLocation(frame.getX() + frame.getWidth(), frame.getY());
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setResizable(false);
		
		JFrame frame3 = new JFrame("Cards");
		frame3.setLayout(new BorderLayout(0,0));
		frame3.setSize(750, 750);
		frame3.setLocation(frame2.getX() + frame2.getWidth(), frame.getY());
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setResizable(false);
		
		JPanel thingy3 = new JPanel();
		thingy3.setLayout(new GridLayout(0, 3));
		frame3.add(thingy3);
		
		JPanel thingy = new JPanel();
		frame2.add(thingy);
		
		JPanel panel = new JPanel();
		//panel.setLayout(new GridBagLayout());
		//panel.setLayout(null);
		frame.add(panel);
		//GridBagConstraints g = new GridBagConstraints();
		
				
		JLabel boardLabel = new JLabel();
		boardLabel.setIcon(board);
		/*
		boardLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(mode.equals("Writing")) {
					fields.add(new JTextField());
					fields.get(fields.size()-1).setLocation(e.getX(), e.getY());
					boardLabel.add(fields.get(fields.size()-1));
					
					panel.repaint();
					panel.revalidate();
					System.out.println("Yippee");
				}
				else if(mode.equals("Crossing Out")) {
					labels.add(new JLabel());
					labels.get(labels.size()-1).setIcon(ecks);
					labels.get(labels.size()-1).setLocation(e.getX(), e.getY());
					boardLabel.add(labels.get(labels.size()-1));
					frame.repaint();
					frame.revalidate();
					System.out.println("Evil Yippee");
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		*/
		
		JLabel back1 = new JLabel();
		back1.setIcon(deck1.remove(0).getBack());
		//front1.setSize(202, 303);
		thingy3.add(back1);
		
		JLabel back2 = new JLabel();
		back2.setIcon(deck2.remove(0).getBack());
		//front2.setSize(202, 303);
		thingy3.add(back2);
		
		JLabel back3 = new JLabel();
		back3.setIcon(deck3.remove(0).getBack());
		//front3.setSize(202, 303);
		thingy3.add(back3);
		
		JLabel front1 = new JLabel();
		front1.setIcon(deck1.get(0).getIcon());
		//back1.setSize(202, 303);
		thingy3.add(front1);
		
		JLabel front2 = new JLabel();
		front2.setIcon(deck2.get(0).getIcon());
		//back2.setSize(202, 303);
		thingy3.add(front2);
		
		
		JLabel front3 = new JLabel();
		front3.setIcon(deck3.get(0).getIcon());
		//back3.setSize(202, 303);
		thingy3.add(front3);
		
		
		panel.add(boardLabel);
		
		
		frame.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(mode.equals("Writing")) {
					fields.add(new JTextField());
					fields.get(fields.size()-1).setLocation(e.getX()-10, e.getY()-50);
					fields.get(fields.size()-1).setSize(20, 30);
					boardLabel.add(fields.get(fields.size()-1));
					
					boardLabel.repaint();
					boardLabel.revalidate();
					System.out.println("Yippee");
				}
				else if(mode.equals("Crossing Out")) {
					labels.add(new JLabel());
					labels.get(labels.size()-1).setIcon(ecks);
					labels.get(labels.size()-1).setLocation(e.getX()-5, e.getY()-40);
					labels.get(labels.size()-1).setSize(15,15);
					boardLabel.add(labels.get(labels.size()-1));
					boardLabel.repaint();
					boardLabel.revalidate();
					labels.get(labels.size()-1).setVisible(true);
					System.out.println("Evil Yippee");
				}
				else if(mode.equals("Fences")) {
					labels.add(new JLabel());
					labels.get(labels.size()-1).setIcon(flence);
					labels.get(labels.size()-1).setLocation(e.getX()-10, e.getY()-60);
					labels.get(labels.size()-1).setSize(20, 60);
					boardLabel.add(labels.get(labels.size()-1));
					boardLabel.repaint();
					boardLabel.revalidate();
					labels.get(labels.size()-1).setVisible(true);
					System.out.println("e");
				}
				else if(mode.equals("Removing")) {
					for(int i = 0; i < labels.size(); i++) {
						System.out.println("Mouse: " + e.getX() + e.getY() + " i: " + labels.get(i).getX() + labels.get(i).getY());
						if(((e.getX() > (labels.get(i).getX() - 50)) && (e.getX() < (labels.get(i).getX() + 50))) && ((e.getY() > (labels.get(i).getY() - 50)) && (e.getY() < (labels.get(i).getY() + 50)))) {
							boardLabel.remove(labels.get(i));
							labels.remove(i);
							boardLabel.repaint();
							boardLabel.revalidate();
							System.out.println("bye");
						}
						System.out.println(i);
					}
					System.out.println("hi");
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		JButton button = new JButton("Writing");
		
		button.setSize(100, 20);
		button.setLocation(10, 40);
		thingy.add(button);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mode = "Writing";
			}
			
		});
		
		JButton button2 = new JButton("Cross Out");
		
		//button2.setSize(100, 20);
		//button.setLocation(button.getX() + button.getWidth() + 10, 400);
		thingy.add(button2);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mode = "Crossing Out";
			}
			
		});
		
		JButton button3 = new JButton("Fence");
		
		//button3.setSize(100, 20);
		//button3.setLocation(button.getX(), button.getY()+button.getHeight());
		thingy.add(button3);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mode = "Fences";
			}
			
		});
		
		JButton button4 = new JButton("Remove");
		
		thingy.add(button4);
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mode = "Removing";
			}
			
		});
		
		JButton button5 = new JButton("Next Cards");
		
		thingy.add(button5);
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(deck1.size() > 1) {
					back1.setIcon(deck1.remove(0).getBack());
					
					back2.setIcon(deck2.remove(0).getBack());
					
					back3.setIcon(deck3.remove(0).getBack());
					
					front1.setIcon(deck1.get(0).getIcon());
					
					front2.setIcon(deck2.get(0).getIcon());
					
					front3.setIcon(deck3.get(0).getIcon());
					
					
				}
				else if(deck1.size() == 1) {
					front1.setIcon(deck1.remove(0).getIcon());
					
					front2.setIcon(deck2.remove(0).getIcon());
					
					front3.setIcon(deck3.remove(0).getIcon());
					
					back1.setIcon(null);
					
					back2.setIcon(null);
					
					back3.setIcon(null);
				}
				thingy3.repaint();
				thingy3.revalidate();
				
			}
			
		});
		
		JButton button6 = new JButton("Shuffle");
		
		thingy.add(button6);
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(deck1 .size() == 0) {
					for(int i = 0; i < deck.size(); i++) {
						deckTake.add(deck.get(i));
					}
					
					for(int i = 1; i <= deckTake.size(); i++) {
						boolean check = false;
						int index = (int) (Math.random() * (deckTake.size()));
						if(i % 3 == 1) {
							deck1.add(deckTake.remove(index));
						}
						else if(i % 3 == 2) {
							deck2.add(deckTake.remove(index));
						}
						else {
							deck3.add(deckTake.remove(index));
						}
					}
					
					front1.setIcon(deck1.remove(0).getIcon());
					
					front2.setIcon(deck2.remove(0).getIcon());
					
					front3.setIcon(deck3.remove(0).getIcon());
					
					back1.setIcon(deck1.get(0).getBack());
					
					back2.setIcon(deck2.get(0).getBack());
					
					back3.setIcon(deck3.get(0).getBack());
				}
			}
				
				
			
		});
		
		thingy3.repaint();
		thingy3.revalidate();

		
		frame.setVisible(true);
		frame2.setVisible(true);
		frame3.setVisible(true);
	}

}
