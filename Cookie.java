class Cookie{
  private int number, bakeTemp, bakeTime;
  private boolean isBaked;
//set variables to 0 and false
  Cookie(){
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isBaked = false;
  }
//set cosntructors
  Cookie(int aNumber, int aBakeTemp) {
    number = aNumber;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTemp;
    isBaked = false;
  }
//set accesor method for isReady
  boolean isReady() {
    return isBaked;
  }
//set mutator method for number
  void setNumber (int aCookieNumber) {
    number = aCookieNumber;
  } 
//create bake method
  void bake (int aBakeTemp, int aBakeTime){
    System.out.println(number + " cookies baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    isBaked = true;
  }

}