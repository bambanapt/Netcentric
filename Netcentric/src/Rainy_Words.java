import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Rainy_Words extends Applet {
	Thread word1;
	Thread word2;
	Thread word3;
	Thread word4;
	Thread word5;
	int delay=100;
	int i=0;
	
	int index1 = 0;
	int index2 = 0;
	int index3 = 0;
	int index4 = 0;
	int index5 = 0;
	
	int x1 = 50;
	int x2 = 200;
	int x3 = 350;
	int x4 = 500;
	int x5 = 650;
	
	int y1 = -5;
	int y2 = -5;
	int y3 = -5;
	int y4 = -5;
	int y5 = -5;
	
//	public static boolean updated=false;
	public static boolean tu=true;
	public static int cat;
	
	final int XLEFTMOST = 0;
	final int XRIGHTMOST = 800;
	final int YTOPMOST = 0;
	final int YBOTTOMMOST = 600;
	
	//netcentric
	String w1[] = {"network", "client", "server", "websites", "netcentric", "connection", "buffer", "database","bit rate" ,"cumulative" ,"delay", "propagation", "retransmission", "payload", "stream" ,"delivery" ,"bandwidth", "HTTP", "local DNS", "CDN"};
	String w2[] = {"transport", "packets", "ping", "IP address", "traceroute", "P2P", "cookie", "handshaking", "wireshark", "datagrams", "frames", "receiver", "throughput", "RTT", "error", "detection", "encoding", "piggybacking", "cache", "information"};
	String w3[] = {"TCP", "data link", "request", "sender", "switch", "UDP", "chunks", "transaction", "support", "BitTorrent", "interface", "segment", "sequence", "transfer", "establish", "proxy", "checksum", "services", "socket", "port number"};
	String w4[] = {"router", "hub", "application", "physical", "congestion", "layers", "reliability", "transmission", "stateless", "loss", "window size", "communication", "flow control", "detection", "redundancy", "Ethernet", "broadcast", "channel", "random access", "multiple access"};
	String w5[] = {"control", "protocols", "destination", "peer", "source", "data", "response", "ALOHA", "efficiency", "node", "collision", "polling", "token", "latency", "cable", "frequency", "wireless", "query", "addressing", "LANs"};

	//animals
	String a1[] = {"alligator","anaconda","bald eager","bullfrog","cat", "chicken", "cockroach","dinosaur","dalmatian","ferret","gecko","greyhound","hippopotamus", "jellyfish","llama","mosquito","nigthingale","panther","raccoon","sheep", "scorpion","tuna","woodchuck","toad"};
	String a2[] = {"ant", "amphibian","barracuda","butterfly","cheetah","crab", "cobra","donkey", "eagle","flamingo","giraffe","german shepherd", "hummingbird", "kangaroo","mackerel","mouse","octopus","peacock","rabbit","shrimp","skunk","wolverine","zebra","tick"};
	String a3[] = {"albatross", "arthropod","basilisk","blue whale", "chimpanzee","chihuahua","chipmunk","dolphin","earthworm","firefly","grasshopper","goldfish","iguana","koala","mammoth","mockingbird","oyster","pigeon","rooster","squirrel","squid","weasel","waterbug","shrimp"};
	String a4[] = {"alpaca","bear","beagle","bumblebee","cow","chameleon","crayfish","dragonfly","electric eel","fox","gorilla","hamster","insect","ladybug","mastiff","mussels","oriole","poodle","reindeer","seahorse","swordfish","woodpecker","warthog","scallop"};
	String a5[] = {"abalone","beaver","bighorn sheep","buffalo","crocodile","caterpillar","dachshund","dog","elephant","gastropod","groundhog","hedgehog","jaguar","leopard","monkey","mollusk","panda","penguin","rhino","tortoise","salamander","wombat","wildebeest","silkworm"};
	
	//brandname
	String b1[] = {“Abercombie&Fitch”, “Acrobat”, “Applebee’s”, “Avis”, “Barbie”, “Beetle”, “BMW”, “Billabong”, “Citibank”, “Clinique”, “Cheez Whiz”, “Cisco”, “Dove”, “Durex”, “FedEx”, “Goldfish”, “Harry Potter”, “Krispy Kreme”, “Maybelline”, “Nutella”, “Puma”, “Roxy”};
	String b2[] = {“Abreva”, “Acer”, “Aquafina”, “Avin”, “Barclays”, “Ben&Jerry’s”, “Boeing”, “Burger King”, “Calvin Klein”, “Carl’s Jr.”, “Cheetos”, “Dairy Queen”, “Doritos”, “Dickies”, “Fanta”, “Gucci”, “Hello Kitty”, “Kleenex”, “Mustang”, “Ovaltine”, “Prudential”, “Red Bull”};
	String b3[] = {“Absolut”, “Aeropostale”, “Arby’s”, “Atkins”, “Baskin-Robbins”, “BlackBerry”, “Buffalo Wild Wings”, “Biore”, “Clairol”, “Colgate”, “Chevrolet”, “Discover”, “DreamWorks”, “Energizer”, “Firestone”, “Guinness”, “Hyundai”, “LaCoste”, “Marriott”, “Olive Garden”, “Philips”, “Ritz-Carlton”};
	String b4[] = {“Accenture”, “Aerosoles”, “Armani”, “Bacardi”, “Bausch&Lomb”, “Blistex”, “Bugs Bunny”, “Butterfinger”, “Clarinex”, “Cartier”, “Chanel”, “DKNY”, “Dunkin Donuts”, “Facebook”, “Fuji Film”, “Hallmark”, “Johnnie Walker”, “Luis Vuitton”, “Marlboro”, “Polo Ralph Lauren”, “Quicksilver”, “Ray-Ban”};
	String b5[] = {“Ace Hardware”, “Amazon.com”, “Aveda”, “Baileys”, “Baxter”, “Blue Ribbon”, “Burberry”, “Cadbury”, “Camel”, “Cheesecake Factory”, “Crest”, “Dentyne”, “Dyson”, “Forbes”, “FrootLoops”, “Hampton Inn”, “Kodak”, “Lexus”, “Neutrogena”, “Prada”, “Rolex”, “Samsung” };
	
	//desserts
	String d1[] = {"bubble gum", "ladyfingers", "sponge cake", "mochi", "honeydew", "jimmies", "crisp", "oreo" ,"sweet rolls", "yam", "sorbet", "peanutbutter", "French toast", "grapefruit", "coconut cake", "rosemary", "oatmeal", "citrus", "wafer", "tart"}; 
	String d2[] = {"greenbean", "cranberry", "hot-fudge", "candy cane", "apricot", "whipped cream", "torte", "sherbet", "pudding", "milkshake", "icing", "frozen yogurt", "eclair", "banana split", "panna cotta", "cantaloupe", "strawberry", "black forest cake", "macaroon","cupcake"};
	String d3[] = {"gumdrops", "marmalade", "sundae", "red velvet", "mousse", "frosting", "butterscotch", "ice cream", "parfait", "jellybeans", "maple syrup", "popcorn", "cherry pie", "s’mores", "praline", "muffin", "fruit salad", "cookie", "brownie", "chocolate"};
	String d4[] = {"fudge", "doughnut", "jam", "marshmallow", "pancakes", "almond", "cheesecake", "raspberry", "lemonade", "scone", "caramel", "baklava", "custard", "honey", "cornflakes", "syrup", "carrot cake", "citron", "truffle", "crepe"};
	String d5[] = {"berry", "gelato", "cinnamon", "meringue", "biscuit", "jelly", "cake", "shortcake", "toffee", "avocado", "vanilla", "toast", "waffle", "cornflakes", "lemon bars", "raisin", "pie", "trifle", "soda", "cherry"};
	
	//nations
	String n1[] = {"Afghanistan", "Antigua and Barbuda", "Austria", "Belarus", "Bolivia", "Bulgaria", "Cameroon", "China", "Cuba", "Djibouti", "El Salvador", "Fiji", "Germany", "Ghana", "Guyana", "Iceland", "Ireland", "Jordan", "Lebanon", "Macau", "Mexico", "Montenegro", "Norway", "Paraguay", "Qatar", "Samoa", "South Korea", "South Africa", "Thailand", "Turkey", "United Kingdom", "Zambia"};
	String n2[] = {"Albania", "Argentina", "Azerbaijan", "Belgium", "Bosnia and Herzegovina", "Burkina Faso","Canada", "Colombia", "Curacao", "Dominica", "Equatorial Guinea", "Finland", "Ghana", "Haiti", "India", "Israel", "Kazakhstan", "Liberia", "Madagascar", "Monaco", "Nepal", "Norway", "Peru", "Romania", "San Marino", "Switzerland", "Somalia", "Timor-Leste", "Tuvalu", "Uruguay", "Zimbabwe"};
	String n3[] = {"Algeria", "Armenia", “Bahrain”, “Belize”, “Botswana”, “Burma”, “Cape Verde”, “Comoros”, “Cyprus”, “Dominican Republic”, “Eritrea”, “France”, “Greece”, “Honduras”, “Indonesia”, “Italy”, “Kyrgyzstan”, “Libya”, “Malaysia”, “Mongolia”, “Netherlands”, “Oman”, “Philippines”, “Russia”, “Saudi Arabia”, “Sweden”, “Taiwan”, “Tonga”, “Uganda”, “Venezuela”, “Turkmenistan”};
	String n4[] = {"Andorra", "Aruba", "Bangladesh”, “Benin”, “Brazil”, “Burundi”, “Chad”, “Costa Rica”, “Czech”, “Ecuador”, “Estonia”, “Gabon”, “Grenada”, “Hong Kong”, “Iran”, “Jamaica”, “Kuwait”, “Luxembourg”, “Maldives”, “Morocco”, “New Zealand”, “Pakistan”, “Poland”, “Rwanda”, “Serbia”, “Sri Lanka”, “Tajikistan”, “Trinidad and Tobago”, “Ukraine”, “Vietnam”, “Uzbekistan”};
	String n5[] = {"Angola", "Australia", “Barbados”, “Bhutan”, “Brunei”, “Cambodia”, “Chile”, “Croatia”, “Denmark”, “Egypt”, “Ethiopia”, “Georgia”, “Guinea”, “Hungary”, “Iraq”, “Japan”, “Latvia”, “Liechtenstein”, “Malta”, “Mozambique”, “Nigeria”, “Panama”, “Portugal”, “Saint Lucia”, “Singapore”, “Syria”, “Tanzania”, “Tunisia”, “United Arab Emirates”, “Yemen”, “Papua New Guinea”};
	
	//random
	
	
	public static int score = 0;
	String text = "";
	
	public void init(){
		this.setSize(new Dimension(800,600));
		word1 = new Thread(run1);
		word2 = new Thread(run2);
		word3 = new Thread(run3);
		word4 = new Thread(run4);
		word5 = new Thread(run5);
		delay = 500;
		word1.start();
		word2.start();
		word3.start();
		word4.start();
		word5.start();
	}
	
	public void paint(Graphics g){
		drawWord1(g);
		drawWord2(g);
		drawWord3(g);
		drawWord4(g);
		drawWord5(g);
		i=i+5;
	}
	
	public void drawWord1(Graphics g){
		if(i>=60){
		g.setFont(new Font("Dialog",Font.PLAIN,20));
		if(cat==1) g.drawString(w1[index1],x1,y1);
		else if(cat==2) g.drawString(a1[index1],x1,y1);
//		else if(cat==3) g.drawString(b1[index1],x1,y1);
		else if(cat==4) g.drawString(d1[index1],x1,y1);
//		else if(cat==5) g.drawString(n1[index1],x1,y1);
//		else if(cat==6) g.drawString(r1[index1],x1,y1);
		y1 += 30;
		}
	}
	
	public void drawWord2(Graphics g){
		if(i>=40){
		g.setFont(new Font("Dialog",Font.PLAIN,20));
		if(cat==1) g.drawString(w2[index2],x2,y2);
		else if(cat==2) g.drawString(a2[index2],x2,y2);
//		else if(cat==3) g.drawString(b2[index2],x2,y2);
		else if(cat==4) g.drawString(d2[index2],x2,y2);
//		else if(cat==5) g.drawString(n2[index2],x2,y2);
//		else if(cat==6) g.drawString(r2[index2],x2,y2);
		y2 += 30;
		}
	}
	
	public void drawWord3(Graphics g){
		if(i>=80){
		g.setFont(new Font("Dialog",Font.PLAIN,20));
		if(cat==1) g.drawString(w3[index3],x3,y3);
		else if(cat==2) g.drawString(a3[index3],x3,y3);
//		else if(cat==3) g.drawString(b3[index3],x3,y3);
		else if(cat==4) g.drawString(d3[index3],x3,y3);
//		else if(cat==5) g.drawString(n3[index3],x3,y3);
//		else if(cat==6) g.drawString(r3[index3],x3,y3);
		y3 += 30;
		}
	}
	
	public void drawWord4(Graphics g){
		g.setFont(new Font("Dialog",Font.PLAIN,20));
		if(cat==1) g.drawString(w4[index4],x4,y4);
		else if(cat==2) g.drawString(a4[index4],x4,y4);
//		else if(cat==3) g.drawString(b4[index4],x4,y4);
		else if(cat==4) g.drawString(d4[index4],x4,y4);
//		else if(cat==5) g.drawString(n4[index4],x4,y4);
//		else if(cat==6) g.drawString(r4[index4],x4,y4);
		y4 += 30;
	}
	
	public void drawWord5(Graphics g){
		if(i>=30){
		g.setFont(new Font("Dialog",Font.PLAIN,20));
		if(cat==1) g.drawString(w5[index5],x5,y5);
		else if(cat==2) g.drawString(a5[index5],x5,y5);
//		else if(cat==3) g.drawString(b5[index5],x5,y5);
		else if(cat==4) g.drawString(d5[index5],x5,y5);
//		else if(cat==5) g.drawString(n5[index5],x5,y5);
//		else if(cat==6) g.drawString(r5[index5],x5,y5);
		y5 += 30;
		}
	}
	
	Runnable run1 = new Runnable() {
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(delay);
					repaint();
					if(y1>=YBOTTOMMOST){
						y1=0;
						index1 += 1;
						if(index1==20) index1=0;
						//index1 = (int)(Math.random() * 20);
						//updated=true;
						
					}
					if(text.equals(w1[index1])){
						
						y1=0;
						index1 += 1;
						if(index1==20) index1=0;
						//index1 = (int)(Math.random() * 20);
						score += 1;
						System.out.println("Score: " + score);
						//updated=true;
					}
					if(tu==false){
						break;
					}
					
				} catch (InterruptedException e) {
				}	
			}
		}
	};
	
	Runnable run2 = new Runnable() {
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(delay);
					repaint();
					if(y2>=YBOTTOMMOST){
						y2=0;
						index2 +=1;
						if(index2==20) index2=0;
						//index2 = (int)(Math.random() * 20);
						//updated=true;
					}
					if(text.equals(w2[index2])){
						y2=0;
						index2 +=1;
						if(index2==20) index2=0;
						//index2 = (int)(Math.random() * 20);
						score += 1;
						System.out.println("Score: " + score);
						//updated=true;
					}
					if(tu==false){
						break;
					}
				} catch (InterruptedException e) {
				}	
			}
		}
	};
	
	Runnable run3 = new Runnable() {
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(delay);
					repaint();
					if(y3>=YBOTTOMMOST){
						y3=0;
						index3 +=1;
						if(index3==20) index3=0;
						//index3 = (int)(Math.random() * 20);
						//updated=true;
					}
					if(text.equals(w3[index3])){
						y3=0;
						index3 +=1;
						if(index3==20) index3=0;
						//index3 = (int)(Math.random() * 20);
						score += 1;
						System.out.println("Score: " + score);
						//updated=true;
					}
					if(tu==false){
						break;
					}
				} catch (InterruptedException e) {
				}	
			}
		}
	};
	
	Runnable run4 = new Runnable() {
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(delay);
					repaint();
					if(y4>=YBOTTOMMOST){
						y4=0;
						index4 +=1;
						if(index4==20) index4=0;
						//index4 = (int)(Math.random() * 20);
						//updated=true;
					}
					if(text.equals(w4[index4])){
						y4=0;
						index4 +=1;
						if(index4==20) index4=0;
						//index4 = (int)(Math.random() * 20);
						score += 1;
						System.out.println("Score: " + score);
						//updated=true;
					}
					if(tu==false){
						break;
					}
				} catch (InterruptedException e) {
				}	
			}
		}
	};
	
	Runnable run5 = new Runnable() {
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(delay);
					repaint();
					if(y5>=YBOTTOMMOST){
						y5=0;
						index5 +=1;
						if(index5==20) index5=0;
						//index5 = (int)(Math.random() * 20);
						//updated=true;
					}
					if(text.equals(w5[index5])){
						y5=0;
						index5 +=1;
						if(index5==20) index5=0;
						//index5 = (int)(Math.random() * 20);
						score += 1;
						System.out.println("Score: " + score);
						//updated=true;
					}
					if(tu==false){
						break;
					}
				} catch (InterruptedException e) {
				}	
			}
		}
	};
	
}
