/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package A4;


import java.util.Vector;

/**
 *
 * @author FanjieLin
 */

public class CodeGenerator {
  
  private static final Vector<String> variables = new Vector<>();  
  private static final Vector<String> labels = new Vector<>();  
  private static final Vector<String> instructions = new Vector<>();

  static void addInstruction(String instruction, String p1, String p2) {
    instructions.add(instruction + " " + p1 + ", " + p2);
  }

  

public static void addLabel(String name, int value) {
    labels.add("#"+name + ", int, " + value);
  }
    
  public static void addVariable(String type, String name) {
    variables.add(name + ", " + type + ", global, null" );
  }

  public static void writeCode(Gui gui) {
    for (String variable : variables) {
      gui.writeCode(variable);    
    }
    for (String label : labels) {
      gui.writeCode(label);    
    }
    gui.writeCode("@");
    for (String instruction : instructions) {
      gui.writeCode(instruction);    
    }

  }
  
  public static void clear(Gui gui) {
    variables.clear();
    instructions.clear();
    labels.clear();
  }  
  
  public static Vector<String> getInstructions() {
		return instructions;
	}
}