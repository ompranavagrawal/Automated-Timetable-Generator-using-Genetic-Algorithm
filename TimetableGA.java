package pro8;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.*;    
import java.awt.event.*;   
import javax.swing.* ;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.xml.crypto.Data;

public class TimetableGA extends Frame implements ActionListener {

	String usnm;
    String pwd;
    Label l1=new Label("user name");
    Label l2=new Label("password");
    Label l3=new Label(" ");
    Label l4=new Label("Want to Reset your password ?");
    Label l5=new Label("User name         ");
    Label l6=new Label("New Password      ");
    Label l7=new Label("Confirmed password");
    Label l8=new Label(" ");
    Label l9=new Label("");
    TextField t1=new TextField("username");  //user name
    TextField t2=new TextField("password");//password
    TextField t3=new TextField("user name");//User name
    TextField t4=new TextField("password1");//new password
    TextField t5=new TextField("con-password");//confirmed password
    Button b= new Button("Submit");
    Button b2= new Button("Reset");
    
    Label AA=new Label("ROOM DATA");
    Label BB=new Label("TIMESLOT/LECTURE DATA");
    Label CC=new Label("PROFESSORS DATA");
    Label DD=new Label("SUBJECT/MODULE DATA");
    Label EE=new Label("GROUP DATA");
    
    Label l11=new Label("Enter rooms' ID:");
    Label l22=new Label("Enter rooms' name:");
    Label l33=new Label("Enter rooms' capacity:");
    Label l44=new Label("Enter timeslots' ID:");
    Label l55=new Label("Enter timeslots' duration:");
    Label l66=new Label("Enter professors' ID:");
    Label l77=new Label("Enter professor' name:");
    Label l88=new Label("Enter modules' ID:");
    Label l99=new Label("Enter modules' code:");
    Label l1010=new Label("Enter modules' name:");
    Label l1111=new Label("Enter professors' ID"); //who teaches these modules:");
    Label l1212=new Label("Enter groups' ID:");
    Label l1313=new Label("Enter groups' size:");
    Label l1414=new Label("Enter modules IDs");//corresponding to each group:");
    Label l1616=new Label("..");
    
    TextArea ta1=new TextArea("Enter IDs separated by enter");
    TextArea ta2=new TextArea();
    TextArea ta3=new TextArea();
    TextArea ta4=new TextArea();
    TextArea ta5=new TextArea();
    TextArea ta6=new TextArea();
    TextArea ta7=new TextArea();
    TextArea ta8=new TextArea();
    TextArea ta9=new TextArea();
    TextArea ta10=new TextArea();
    TextArea ta11=new TextArea();
    TextArea ta12=new TextArea();
    TextArea ta13=new TextArea();
    TextArea ta14=new TextArea();
   
   
    Button b123= new Button("CREATE");
    public static String rid[],rname[],rcap[],tid[],tslot[],pid[],pname[],mid[],mcode[],mname[],mpid[],gid[],gsize[],gmid[];
    
        
    public static void main(String[] args) {
    	TimetableGA l=new TimetableGA();
        l.setSize(new Dimension(400,400));
        l.setTitle("Login");
        l.setVisible(true);
    	
    }
	
      
      public TimetableGA(int i){
    	  
    	    AA.setBounds(10,45,1350,20);
    	    AA.setAlignment(Label.CENTER);
    	    AA.setBackground(Color.YELLOW);
    	    AA.setForeground(Color.BLUE);
    	    AA.setFont(new Font("Serif", Font.BOLD, 19));
    	    BB.setBounds(10,175,1350,20);
    	    BB.setAlignment(Label.CENTER);
    	    BB.setBackground(Color.YELLOW);
    	    BB.setForeground(Color.BLUE);
    	    BB.setFont(new Font("Serif", Font.BOLD, 19));
    	    CC.setBounds(10,305,1350,20);
    	    CC.setAlignment(Label.CENTER);
    	    CC.setBackground(Color.YELLOW);
    	    CC.setForeground(Color.BLUE);
    	    CC.setFont(new Font("Serif", Font.BOLD, 19));
    	    DD.setBounds(10,435,1350,20); 
    	    DD.setAlignment(Label.CENTER);
    	    DD.setBackground(Color.YELLOW);
    	    DD.setForeground(Color.BLUE);
    	    DD.setFont(new Font("Serif", Font.BOLD, 19));
    	    EE.setBounds(10,565,1350,20);
    	    EE.setAlignment(Label.CENTER);
    	    EE.setBackground(Color.YELLOW);
    	    EE.setForeground(Color.BLUE);
    	    EE.setFont(new Font("Serif", Font.BOLD, 19));
    	    b123.setBounds(640,695,100,20);
    	    b123.setBackground(Color.GREEN);
    	    b123.setFont(new Font("Serif", Font.BOLD, 19));
    	    
    	    l11.setBounds(60,65,100,20);
    	    ta1.setBounds(160,65,150,70);
    	    l22.setBounds(400,65,115,20);
    	    ta2.setBounds(520,65,150,70);
    	    l33.setBounds(750,65,130,20);
    	    ta3.setBounds(880,65,145,70);
    	    l44.setBounds(180,200,120,20);
    	    ta4.setBounds(300,200,150,70);
    	    l55.setBounds(540,200,150,20);
    	    ta5.setBounds(700,200,150,70);
    	    l66.setBounds(180,330,120,20);
    	    ta6.setBounds(300,330,150,70);
    	    l77.setBounds(540,330,150,20);
    	    ta7.setBounds(700,330,150,70);
    	    l88.setBounds(40,455,110,20);
    	    ta8.setBounds(150,455,150,70);
    	    l99.setBounds(330,455,118,20);
    	    ta9.setBounds(450,455,150,70);
    	    l1010.setBounds(630,455,130,20);
    	    ta10.setBounds(760,455,150,70);
    	    l1111.setBounds(950,455,110,20);/////////////who teaches these modules:
    	    Label l11a=new Label("who teaches these "); l11a.setBounds(950,475,110,20);
    	    Label l11b=new Label("modules:"); l11b.setBounds(950,495,110,20);
    	    
    	    ta11.setBounds(1070,455,150,70);
    	    l1212.setBounds(60,585,100,20);
    	    ta12.setBounds(160,585,150,70);
    	    l1313.setBounds(400,585,105,20);
    	    ta13.setBounds(520,585,150,70);
    	    l1414.setBounds(750,585,110,20);
    	    Label l14a=new Label("corresponding to"); l14a.setBounds(750,605,110,20);
    	    Label l14b=new Label("each group:"); l14b.setBounds(750,625,110,20);
    	    ta14.setBounds(880,585,150,70);
    	    b123.addActionListener(this);


    	    //addWindowListener(new mwa1());
    	    add(AA);
    	    add(BB);
    	    add(CC);
    	    add(DD);
    	    add(EE);
    	    add(l11);
    	    add(ta1);
    	    add(l22);
    	    add(ta2);
    	    add(l33);
    	    add(ta3);
    	    add(l44);
    	    add(ta4);
    	    add(l55);
    	    add(ta5);
    	    add(l66);
    	    add(ta6);
    	    add(l77);
    	    add(ta7);
    	    add(l88);
    	    add(ta8);
    	    add(l99);
    	    add(ta9);
    	    add(l1010);
    	    add(ta10);
    	    add(l1111); add(l11a); add(l11b);
    	    add(ta11);
    	    add(l1212);
    	    add(ta12);
    	    add(l1313);
    	    add(ta13);
    	    add(l1414); add(l14a); add(l14b);
    	    add(ta14);
    	    add(b123);
    	    //add(l1515);
    	    add(l1616);
    	    addWindowListener(new mwa());

      }
      public TimetableGA()
      { 
    	Panel p=new Panel();
    	p.setBackground(Color.pink);
    	add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);
      
        p.add(l4);
        p.add(l5);
        p.add(t3);
        p.add(l6);
        p.add(t4);
        p.add(l7);
        p.add(t5);
        p.add(b2);
        p.add(l8);
        p.add(l9);
        add(p);
        add(l9);
        
        l1.setBounds(20,45,70,20);
        t1.setBounds(180,45,200,20);
        l2.setBounds(20,95,70,20);
        t2.setBounds(180,95,200,20);
        b.setBounds(280,145,70,40);
        b.addActionListener(this);//first button
        t2.setEchoChar('*');
        l3.setBounds(20, 145, 300, 20);
        b2.setBounds(360,395,70,20);
        b2.addActionListener(this); //second button
        l4.setBounds(20,195,300,20);
        l5.setBounds(20,245,300,20);
        t3.setBounds(380,245,200,20);    
        l6.setBounds(20,295,300,20);
        t4.setBounds(380,295,200,20);
        l7.setBounds(20,345,300,20);
        t5.setBounds(380,345,200,20);
        l8.setBounds(380,345,200,20);
        p.setBounds(60, 200, 250, 160);
        
        addWindowListener(new mwa());
      }
      public boolean validity(String userName , String password) throws FileNotFoundException{
    	 
    	  File file = new File("C:\\Users\\PC\\workspace\\pro8\\src\\pro8\\password.txt");
    	     Scanner scr = null;
    	     String code="";
    		 String name="";

    	         try {
    	            scr = new Scanner(file);

    	            	name=(scr.next());
    	            	code=(scr.next());

    	         }
    	         finally{
    	        	 
    	         }
     
    	  if((code.equals(t2.getText()))&& (name.equals(t1.getText()))){
    		  return true;
    	  }
    	  else{
    		  return false;
    	  }
      }
      
      public void Reset() throws IOException
      {	
    	  String newPassword=t4.getText();
    	  String conPassword=t5.getText();
    	  if(newPassword.equals(conPassword)){
    		     	try (FileWriter fileWriter = new FileWriter("C:\\Users\\PC\\workspace\\pro8\\src\\pro8\\password.txt")) {
    		            fileWriter.write(t3.getText());
    		            fileWriter.write("\n");
    		            fileWriter.write(t4.getText());
    		        }
    		         finally{
    		        	 l3.setText("password changed");
    		         }
    	  }
    	  else{
    		  l3.setText("new and confirmed passwords are not same");
    	  }
      
    	  
      }
      
      public void actionPerformed(ActionEvent ae)
      { 	
    	String str=ae.getActionCommand();
      	if(str.equals("Submit")){
    	    usnm=t1.getText();
      		pwd=t2.getText();
      		try {
    			if(validity(usnm, pwd)){
    				l3.setText("Welcome "+t1.getText());
    				int i;
					TimetableGA tga=new TimetableGA(1);
					tga.setSize(new Dimension(1370,890));
    				tga.setTitle("Data Entry Form");
    				tga.setVisible(true);
    			}
    			else{
    				l3.setText("Invalid Username or Password");
    			
    			}
    		} 
      		catch (FileNotFoundException e) {
    			
    			e.printStackTrace();
    		}
         }
      	else{
      		try {
    			Reset();
    		} catch (IOException e) {
    		
    			e.printStackTrace();
    		}
      	}
      	//try{
      	 if(str.equals("CREATE")){
      		 
      		
 		    //write code here
 		  rid=ta1.getText().split("\\r?\\n");
 		  rname=ta2.getText().split("\\r?\\n");
 		  rcap=ta3.getText().split("\\r?\\n");
 		  tid=ta4.getText().split("\\r?\\n");
 		  tslot=ta5.getText().split("\\r?\\n");
 		  pid=ta6.getText().split("\\r?\\n");
 		  pname=ta7.getText().split("\\r?\\n");
 		  mid=ta8.getText().split("\\r?\\n");
 		  mcode=ta9.getText().split("\\r?\\n");
 		  mname=ta10.getText().split("\\r?\\n");
 		  mpid=ta11.getText().split("\\r?\\n");
 		  gid=ta12.getText().split("\\r?\\n");
 		  gsize=ta13.getText().split("\\r?\\n");
 		  gmid=ta14.getText().split("\\r?\\n");
 		  
 		  
 		  mainFunction();
      	 }
      }
    
    class mwa extends WindowAdapter
    { public mwa(){}
      public void windowClosing(WindowEvent e)
      { System.exit(0);
      }
    }
    
    public static int[] stoi(String s){
  	  String[] integerStrings = s.split("[,]");//[.]
  	  int[] integers = new int[integerStrings.length]; 
  	  for (int i = 0; i < integers.length; i++){
  	     integers[i] = Integer.parseInt(integerStrings[i]); 
  	  }
  	return integers;
    }
    
    public static void mainFunction(){
        Timetable timetable = initializeTimetable();
        
        GeneticAlgorithm ga = new GeneticAlgorithm(100, 0.01, 0.9, 2, 5);
        
        Population population = ga.initPopulation(timetable);
        
        ga.evalPopulation(population, timetable);
        
        int generation = 1;
        
        while (ga.isTerminationConditionMet(generation, 1000) == false
            && ga.isTerminationConditionMet(population) == false) {
            System.out.println("Generation # " + generation + " Best fitness: " + population.getFittest(0).getFitness());
            population = ga.crossoverPopulation(population);
            population = ga.mutatePopulation(population, timetable);
            ga.evalPopulation(population, timetable);
            generation++;
        }

        // Print fitness
        timetable.createClasses(population.getFittest(0));
        System.out.println();
        System.out.println("Solution found in " + generation + " generations");
        System.out.println("Final solution fitness: " + population.getFittest(0).getFitness());
        System.out.println("Clashes: " + timetable.calcClashes());

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        model.addColumn("S.No.");
        model.addColumn("Module");
        model.addColumn("Group");
        model.addColumn("Room");
        model.addColumn("Professor");
        model.addColumn("Time");
        Class classes[] = timetable.getClasses();
        int classIndex = 1;
        for (Class bestClass : classes) {
            model.addRow(new Object[] { classIndex,timetable.getModule(bestClass.getModuleId()).getModuleName(),timetable.getGroup(bestClass.getGroupId()).getGroupId(),timetable.getRoom(bestClass.getRoomId()).getRoomNumber(),timetable.getProfessor(bestClass.getProfessorId()).getProfessorName(),timetable.getTimeslot(bestClass.getTimeslotId()).getTimeslot()});
            classIndex++;
        }
        JFrame f = new JFrame();
        String input = JOptionPane.showInputDialog("Enter Timtable Name");
        f.setTitle(input);
        f.setSize(700, 500);
        f.add(new JScrollPane(table));
        f.setVisible(true);
        File file = new File("C:/Users/PC/workspace/pro8/src/pro8/"+input+".txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);            
            classIndex = 1;           
            fr.write(String.format("%20s %20s %20s %20s %20s %20s \r\n", "S.No.", "Group", "Module", "Room", "Professor", "Time"));            
            fr.write("-------------------------------------------------------------------------------------------------------------------------------------");
            fr.write("\r\n");
            for (Class bestClass : classes) {
            	fr.write(String.format("%20s %20s %20s %20s %20s %20s \r\n", classIndex,timetable.getModule(bestClass.getModuleId()).getModuleName(),timetable.getGroup(bestClass.getGroupId()).getGroupId(),timetable.getRoom(bestClass.getRoomId()).getRoomNumber(),timetable.getProfessor(bestClass.getProfessorId()).getProfessorName(),  timetable.getTimeslot(bestClass.getTimeslotId()).getTimeslot()));
                classIndex++;
            }
            fr.write("-------------------------------------------------------------------------------------------------------------------------------------");
            fr.write("\r\n");
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  
    private static Timetable initializeTimetable() {
		// Create timetable
		Timetable timetable = new Timetable();
		try{
		for(int i=0;i<rid.length;i++){
			timetable.addRoom(Integer.parseInt(rid[i]), rname[i], Integer.parseInt(rcap[i]));
		}
		
		for(int i=0;i<tid.length;i++){
			timetable.addTimeslot(Integer.parseInt(tid[i]), tslot[i]);
		}

		for(int i=0;i<pid.length;i++){
			timetable.addProfessor(Integer.parseInt(pid[i]), pname[i]);
		} 
		
		for(int i=0;i<mid.length;i++){
			timetable.addModule(Integer.parseInt(mid[i]), mcode[i], mname[i], stoi(mpid[i]));
		} 

		for(int i=0;i<gid.length;i++){
			timetable.addGroup(Integer.parseInt(gid[i]), Integer.parseInt(gsize[i]), stoi(gmid[i]));
		}
		return timetable;
		
		}
		catch(Exception e){
			final JPanel panel = new JPanel();

		    JOptionPane.showMessageDialog(panel, "Enter The Correct Data !!", "Error", JOptionPane.ERROR_MESSAGE);
		    
		    return null;
		}
		
		
	}
    
    
}
