import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Color;
import java.awt.Graphics;

public class View extends JFrame {
	private final ButtonGroup btnGroupBodyFrame = new ButtonGroup();
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	private final ButtonGroup btnGroupPA = new ButtonGroup();
	private JPanel panel = new JPanel();
	private JPanel contentPane = new JPanel();
	private JLabel lblWeight = new JLabel("Actual Weight");
	private JLabel lblName;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JButton btnCalculateBmi;
	private JLabel lblNewLabel;
	private JLabel lblPa;
	private JTextField weight;
	private JRadioButton rdbtnNotAcctive;
	private JRadioButton rdbtnActive;
	private JRadioButton rdbtnVeryActive;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblEER_1;
	private JSlider slider;
	private JLabel lblAge;
	private JPanel panel_2;
	private JSlider slider_1;
	private JLabel heightLabel_1;
	private JLabel ageLabel_1;
	private JLabel labelBMI;
	private JLabel labelEER;
	private JButton buttonClean;
	private JLabel lblNewLabel_2;
	private JLabel labelBackround;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblBackround;
	private JLabel lblWeightStatus;
	private JLabel weightSummery = new JLabel("---",JLabel.CENTER);
	public View() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 518);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		panel.setBackground(new Color(255, 255, 0));
		panel.setForeground(new Color(0, 128, 0));

		panel.setBounds(6, 196, 488, 153);
		contentPane.add(panel);
		panel.setLayout(null);

		
		lblWeight.setBounds(20, 19, 87, 16);
		panel.add(lblWeight);

		btnCalculateBmi = new JButton("Calculate BMI");
		btnCalculateBmi.setBounds(6, 107, 236, 40);
		panel.add(btnCalculateBmi);

		lblNewLabel = new JLabel("Body Frame");
		lblNewLabel.setBounds(20, 51, 72, 16);
		panel.add(lblNewLabel);

		lblPa = new JLabel("PA");
		lblPa.setBounds(20, 79, 72, 16);
		panel.add(lblPa);

		rdbtnNotAcctive = new JRadioButton("Lazy");
		rdbtnNotAcctive.setActionCommand("Lazy");
		btnGroupPA.add(rdbtnNotAcctive);
		rdbtnNotAcctive.setBounds(119, 75, 94, 23);
		panel.add(rdbtnNotAcctive);

		rdbtnActive = new JRadioButton("Active");
		rdbtnActive.setActionCommand("Active");
		rdbtnActive.setSelected(true);
		btnGroupPA.add(rdbtnActive);
		rdbtnActive.setBounds(208, 75, 94, 23);
		panel.add(rdbtnActive);

		rdbtnVeryActive = new JRadioButton("Very Active");
		rdbtnVeryActive.setActionCommand("Very");
		btnGroupPA.add(rdbtnVeryActive);
		rdbtnVeryActive.setBounds(296, 75, 102, 23);
		panel.add(rdbtnVeryActive);
		
		weight = new JTextField();
		weight.setText("100");
		weight.setBounds(119, 14, 86, 26);
		panel.add(weight);
		weight.setColumns(10);
		
		JRadioButton rdbtnLazy = new JRadioButton("Small");
		btnGroupBodyFrame.add(rdbtnLazy);
		rdbtnLazy.setBounds(119, 47, 86, 23);
		panel.add(rdbtnLazy);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setSelected(true);
		btnGroupBodyFrame.add(rdbtnMedium);
		rdbtnMedium.setBounds(208, 47, 94, 23);
		panel.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		btnGroupBodyFrame.add(rdbtnLarge);
		rdbtnLarge.setBounds(296, 47, 94, 23);
		panel.add(rdbtnLarge);
		
		buttonClean = new JButton("Clear All");
		buttonClean.setBounds(244, 107, 238, 40);
		panel.add(buttonClean);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("/Users/shayelbaz/Downloads/Photos Downloads/9c40f34474d56b24c18814adea586009.jpg"));
		lblNewLabel_4.setBounds(0, 0, 488, 153);
		panel.add(lblNewLabel_4);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(6, 361, 488, 127);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		lblNewLabel_1 = new JLabel("BMI");
		lblNewLabel_1.setBounds(60, 0, 23, 16);
		panel_1.add(lblNewLabel_1);

		lblEER_1 = new JLabel("EER");
		lblEER_1.setBounds(402, 0, 23, 16);
		panel_1.add(lblEER_1);
		
		labelBMI = new JLabel("---",JLabel.CENTER);
		labelBMI.setBounds(6, 51, 131, 16);
		panel_1.add(labelBMI);
		
		
		labelEER = new JLabel("---",JLabel.CENTER);
		labelEER.setBounds(335, 51, 153, 16);
		panel_1.add(labelEER);
		
		lblWeightStatus = new JLabel("Weight Status");
		lblWeightStatus.setBounds(192, 0, 86, 16);
		panel_1.add(lblWeightStatus);
		
		
		weightSummery.setBounds(165, 51, 143, 16);
		panel_1.add(weightSummery);
		
		lblBackround = new JLabel("");
		lblBackround.setIcon(new ImageIcon("/Users/shayelbaz/Downloads/Photos Downloads/9c40f34474d56b24c18814adea586009.jpg"));
		lblBackround.setBounds(0, 0, 488, 127);
		panel_1.add(lblBackround);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(6, 6, 488, 178);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setSelected(true);
		btnGroupGender.add(rdbtnMale);
		rdbtnMale.setBounds(333, 6, 61, 23);
		panel_2.add(rdbtnMale);

		rdbtnFemale = new JRadioButton("Female");
		btnGroupGender.add(rdbtnFemale);
		rdbtnFemale.setBounds(406, 6, 76, 23);
		panel_2.add(rdbtnFemale);

		slider = new JSlider();
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		slider.setValue(100);
		slider.setMaximum(120);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(6, 56, 482, 38);
		panel_2.add(slider);

		lblAge = new JLabel("Age");
		lblAge.setBounds(16, 39, 61, 16);
		panel_2.add(lblAge);

		slider_1 = new JSlider();
		slider_1.setToolTipText("");
		slider_1.setSnapToTicks(true);
		slider_1.setValue(100);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setMinorTickSpacing(5);
		slider_1.setMaximum(250);
		slider_1.setMajorTickSpacing(20);
		slider_1.setBounds(6, 134, 482, 38);
		panel_2.add(slider_1);

		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(16, 117, 61, 16);
		panel_2.add(lblHeight);

		lblName = new JLabel("BMI Calculator - Shay Elbaz");
		lblName.setBounds(16, 10, 181, 16);
		panel_2.add(lblName);
		
		ageLabel_1 = new JLabel("0");
		
		ageLabel_1.setBounds(46, 39, 116, 16);
		panel_2.add(ageLabel_1);
		
		heightLabel_1 = new JLabel("0");
		heightLabel_1.setBounds(64, 117, 116, 16);
		panel_2.add(heightLabel_1);
		
		lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setBounds(260, 10, 61, 16);
		panel_2.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/shayelbaz/Downloads/Photos Downloads/abstract-color-pastel-background-a-soft-sky-with-cloud-background-in-pastel-color_6529-37.jpg"));
		lblNewLabel_3.setBounds(0, 0, 488, 178);
		panel_2.add(lblNewLabel_3);
		
		labelBackround = new JLabel("New label");
		labelBackround.setIcon(new ImageIcon("/Users/shayelbaz/Downloads/Photos Downloads/50-Beautiful-and-Minimalist-Presentation-Backgrounds-04.jpg"));
		labelBackround.setBounds(0, 0, 519, 502);
		contentPane.add(labelBackround);

	}

	public String getLblName() {
		return lblName.getText();
	}

	public void setLblName(String str) {
		lblName.setText(str);
	}

	public boolean getrdbtnMale() {
		return rdbtnMale.isSelected();
	}

	public boolean getrbtFemale() {
		return rdbtnFemale.isSelected();
	}

	public int getSliderAge() {
		return slider.getValue();
	}

	public void addViewListener(ActionListener listenForView) {
		btnCalculateBmi.addActionListener(listenForView);
		buttonClean.addActionListener(listenForView);
	}
	
	public void addChangedListener(ChangeListener l) {
		slider.addChangeListener(l);
		slider_1.addChangeListener(l);
	}

	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	public int getWeight() {
		return Integer.parseInt(weight.getText());
	}

	public int getSliderHeight() {
		return slider_1.getValue();
	}

	public double getBtnGroupPA() {		
		String  BC = btnGroupPA.getSelection().getActionCommand();
		if(BC=="Lazy")
			return 1.0;
		else if(BC=="Active")
			return 1.27;
		else if(BC=="Very")
			return 1.45;
		else
			return 0;
	}

	public String getBtnGroupBodyFrame() {
		int BC = btnGroupBodyFrame.getButtonCount();
		if(BC==1)
			return "small";
		else if(BC==2)
			return "medium";
		else if(BC==3)
			return "Large";
		else
			return "";
		}

	public void setHeightLabel(int height) {
		String str = Integer.toString(height);
		heightLabel_1.setText(str);
	}

	public void setAgeLabel(int age) {
		String str = Integer.toString(age);	
		ageLabel_1.setText(str);
	}

	public void setLabelBMI(double labelBMI2) {
		DecimalFormat df = new DecimalFormat("#.00");
		labelBMI.setText( "Value: " + df.format(labelBMI2));
	}

	public void setLabelEER(double labelEER) {
		DecimalFormat df = new DecimalFormat("#.00");
		this.labelEER.setText("Calories: " + df.format(labelEER));
	}

	public Object getBottunClear() {
		return buttonClean;
	}

	public void clearAll() {
		btnGroupBodyFrame.clearSelection();
		btnGroupGender.clearSelection();
		btnGroupPA.clearSelection();
		weight.setText("");
		heightLabel_1.setText("0");
		ageLabel_1.setText("0");
		slider.setValue(0);
		slider_1.setValue(0);
		labelBMI.setText("---");
		labelEER.setText("---");
		weightSummery.setText("---");
	}

	public void setWeightStatus(String str) {
		weightSummery.setText(str);		
	}
}
