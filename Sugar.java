class Sugar extends Cookie {
  String shape;
  boolean isDecorated;
//set variables to blan and false
  Sugar() {
    shape = "";
    isDecorated = false;
  }
  //set constructors
  Sugar(String aShape) {
    shape = aShape;
    isDecorated = false;
  }
//set accessor method
  String getShape() {
    return shape;
  }
//set mutator method
  void setShape(String aShape) {
    shape = aShape;
  }
  //create shape cut out method
  void shapeCutOut(String aShape, int number) {
    System.out.println(number + " cookies were cut into " + aShape);
    super.setNumber(number);
  }
  //create decorate method
  void decorate() {
    if (super.isReady()== true) {
      isDecorated = true;
      System.out.println("The Cookies were decorated");
    }
    else{
      System.out.println("Make sure to bake cookies first");
    }
  }
}
