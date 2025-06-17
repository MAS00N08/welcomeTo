package welcomeTo;

import javax.swing.ImageIcon;

public class Card {
	private ImageIcon icon;
	private ImageIcon back;
	
	public Card(ImageIcon i, ImageIcon b) {
		icon = i;
		back = b;
	}
	
	public ImageIcon getIcon() {
		return icon;
	}
	
	public ImageIcon getBack() {
		return back;
	}
}
