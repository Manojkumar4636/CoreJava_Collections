/*Control Statement
-----------------
=> Control the flow of execution

1 - Conditional Statement
2 - Looping Statement
3 - Jumping Statement

1 - Conditional Statement
--------------------------
  => if Condition
  => if else Condition
  => nested if Condition
  => if else if Condition
  =>Switch case
  
1 - if Condition
----------------
=> Condition true it will executed otherwise ignored the block.

SYNTAX:  if(condition){
                        //block of code
                      }

2 - if else Condition
---------------------
=> Condition true it will executed if block, condition false it will executed else block.

SYNTAX:  if(condition){
                        //block of code
                      }else{
                        //block of code
                      } 

3 - nested if Condition
------------------------
=>Nested if statements mean an if statement inside another if statement, when need to check multiple conditions.

SYNTAX:   if(condition){
                        //block of code
                      }
                      if(condition){
                                     //block of code
                                   }
                      if(condition){
                                     //block of code
                                   }

4 - if else if / else if ladder Condition
-----------------------------------------
=>if else if statement is used when need to check multiple conditions.
=>In this statement we have only one "if" and one "else", but multiple "else if".
=>It is also know as if else if ladder.

SYNTAX:   if(condition){
                        //block of code
                       }else if(condition){
                        //block of code
                       }else if(condition){
                        //block of code
                       }else{
                        //block of code
                       }

5 - Switch case
----------------
=> It is like an if-else-if ladder statement

SYNTAX:   switch(condition){
                            case1:
                                //block of code
                            break;
                            
                            case2:
                                //block of code
                            break;
                            
                            case3:
                                //block of code
                            break;
                            
                            default:
                                //block of code
                           }


*/
package com.learn.java.day4;

//Define if & if else Condition 

public class ControlStatement {
	public static void main(String[] args) {
		int a = 50;
                int b = 100;
		if (a<b) {
			System.out.println("a is correct");
		}else {
			System.out.println("a is wrong");
		}

	}
}
