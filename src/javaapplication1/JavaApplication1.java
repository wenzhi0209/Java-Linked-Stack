/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author wenzh
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedStack stackA = new LinkedStack();
        LinkedStack stackC = new LinkedStack();
        LinkedStack stackCopy = new LinkedStack();
        Integer[] numbers = {1, 2, 3, 4};
        //push testing
        stackA.push('A');
        stackA.push("letter");
        //pushAll testing
        stackA.pushAll(numbers);
        //size testing
        System.out.println("HERE : " + stackA.size());
        //is emtpy testing
        System.out.println("EMTPY : " + stackA.isEmpty());
        // to array testing
        Object[] test=new Object[10];
        stackA.toArray(test);
        
        for (int i = 0; i < test.length; i++) {
            System.out.println("Array [" + i + "]: " + test[i]);
        }

        LinkedStack stackB = new LinkedStack();

        stackB.copyPart(stackA, 4);
        stackC.copy(stackA);
        System.out.println("stack B: " + stackB.toString());
        System.out.println("stack A: " + stackA.toString());

        stackB.pop();
        System.out.println("stack B TOP : " + stackB.getTop());
        stackB.pop();
        System.out.println("stack B SIZE : " + stackB.size());

        System.out.println("stack A before test combine: " + stackA.toString());
        System.out.println("stack B before test combine: " + stackB.toString());

        stackB.combine(stackA);
        System.out.println("stack A test combine: " + stackA.toString());
        System.out.println("stack B test combine: " + stackB.toString());

        System.out.println("stack B HERE : " + stackB.size());
        System.out.println("stack B: " + stackB.toString());
        
        stackCopy.copy(stackB);
        System.out.println("stack B EQUALS? : " + stackCopy.equals(stackB));
        stackB.pop();
        System.out.println("stack B EQUALS? : " + stackCopy.equals(stackB));
        
        
        stackB.clear();
        System.out.println("stack B contain <letter>: " + stackB.contain("letter"));
        System.out.println("stack A contain <letter>: " + stackA.contain("letter"));
        System.out.println("stack A contain <letter>: " + stackC.contain("letter"));
        System.out.println("stack A and C equal: " + stackC.equals(stackA));
        System.out.println("stack A and C equal: " + stackC.equals(stackA));
        stackC.reverse();
        System.out.println("stack A and C equal: " + stackC.equals(stackA));

        System.out.println("stack A: " + stackA.toString());
        System.out.println("stack C: " + stackC.toString());
        System.out.println("stack A: " + stackA.size());
        System.out.println("stack C: " + stackC.size());

        stackC.clear();
        stackC.push('O');
        stackC.push('E');
        stackC.push('T');
        stackC.push('E');

        stackA.combine(stackC);
        System.out.println("stack A: " + stackA.toString());
        System.out.println("stack A pos E: " + stackA.posOfElement('E'));
        System.out.println("stack A pos 2: " + stackA.elementAtPos(2));

    }

}
