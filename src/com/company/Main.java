package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animals ={new Shark(), new Eagle(),new Turtle()};
        Shark[] shark ;
        Eagle[] eagle ;
        Turtle[] turtle;
        /*Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
        болуп оз озунун массивине салыныз*/
//
//        for (Animal wild: animals) {
//            switch (wild.getClass().getName()) {
//                case "com.company.Shark" -> ((Shark) wild).attack();
//                case "com.company.Eagle" -> ((Eagle) wild).fly();
//                case "com.company.Turtle" -> ((Turtle) wild).swim();
//            }
//        }
//        for (Animal pet: animals){
//            if (pet instanceof Shark){
//                ((Shark)pet).attack();
//            }else if (pet instanceof  Eagle){
//                ((Eagle)pet).fly();
//            }else {
//                ((Turtle)pet).swim();
//            }
//
//        }


        for (int i = 0 ; i < animals.length; i++){
            animals[i] = new Shark();
            ++i;
        }
        for (int i = 0 ; i < animals.length; i++){
            animals[i] = new Eagle();
            ++i;
        }
        for (int i = 0 ; i < animals.length; i++){
            animals[i] = new Turtle();
            ++i;
        }
        }
    }

