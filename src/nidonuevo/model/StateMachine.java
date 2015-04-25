/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nidonuevo.model;
import java.awt.Graphics;
import java.util.Stack;

public class StateMachine {
    
    private Stack<State> stackSM=new Stack<State>();
    
    public void tick(){ 
        this.stackSM.peek().tick();

    }
    
    public void render(Graphics g){
        this.stackSM.peek().render(g);
    }
    
    public void add(State state){
       this.stackSM.push(state);
    }
    
    public void pull(){
        
    }

    public Stack<State> getState() {
        return stackSM;
    }

    public void setState(Stack<State> stackSM) {
        this.stackSM = stackSM;
    }
    
    
}
