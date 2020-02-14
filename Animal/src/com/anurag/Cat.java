package com.anurag;

public class Cat extends Animal{

    private String tail;
    private String cute;

    public Cat(String animalName, String coat, String tail, String cute) {
        super(animalName, 4, coat);
        this.tail = tail;
        this.cute = cute;
    }

    public class WhiteBlack {

        private String favourateColor;
        private String whySpecial;

        public WhiteBlack(String favourateColor, String whySpecial) {
            this.favourateColor = favourateColor;
            this.whySpecial = whySpecial;
        }

        public String getFavourateColor() {
            return favourateColor;
        }

        public String getWhySpecial() {
            return whySpecial;
        }

        public void lastLines() {
            System.out.println("This is something new.");
        }
    }

    public String getTail() {
        return tail;
    }

    public String getCute() {
        return cute;
    }

    @Override
    public void eat() {
        System.out.println("Dog inherit property of Animal.");
        super.eat();
    }
}

