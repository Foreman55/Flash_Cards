public class Card {
    String frontSide;
    String backSide;

    public String getFrontSide() {
        return frontSide;
    }

    public void setFrontSide(String frontSide) {
        this.frontSide = frontSide;
    }

    public String getBackSide() {
        return backSide;
    }

    public void setBackSide(String backSide) {
        this.backSide = backSide;
    }

    public String flipCard(){
        return this.backSide;
    }

    public Card(String frontSide, String backSide) {
        this.frontSide = frontSide;
        this.backSide = backSide;
    }

    public String checkAnswer (String answer){
        if(answer.equals(backSide)){
            return "True";
        }
        return "False";
    }
}
