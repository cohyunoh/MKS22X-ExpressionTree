public class ExpressionTree{
  /*return the expression as an infix notation string with parenthesis*/
  /* The sample tree would be: "(3 + (2 * 10))"     */
  public String toString(){
    /*you are to write this method*/
    if(isValue()){
      return getValue() + "";
    }else{
      return "(" + getLeft().toString() + " " + getRight().toString() +")";
    }
  }

  /*return the expression as a postfix notation string without parenthesis*/
  /* The sample tree would be: "3 2 10 * +"     */
  public String toStringPostfix(){
    /*you are to write this method*/
    if(isValue()){
      return getValue() + "";
    }else{
      return getLeft().toStringPrefix() + " " + getRight().toStringPrefix() + " " + getOp();
    }
  }

  /*return the expression as a prefix notation string without parenthesis*/
  /* The sample tree would be: "+ 3 * 2 10"     */

  public String toStringPrefix(){
    /*you are to write this method*/
    if(isValue()){
      return getValue() + "";
    }else{
      return getOp() + " " + getLeft().toStringPrefix() + " " + getRight().toStringPrefix();
    }
  }



  /*return the value of the specified expression tree*/

  public double evaluate(){
    /*you are to write this method*/
    if(isValue()){
      return getValue();
    }else{
      return apply(getOp(), getLeft().evaluate(), getRight(),evaluate());
    }

    }


  /*use the correct operator on both a and b, and return that value*/
  private double apply(char op, double a, double b){
    /*you are to write this method*/
    if(op == '+'){
      return a + b;
    }else if(op == '-'){
      return a - b;
    }else if(op == '*'){
      return a * b;
    }
    return a / b;

    }

}
