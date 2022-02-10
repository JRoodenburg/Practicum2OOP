package com.JRoodenburg;

public class Main {
    public static class Zwembad {
        double lengte;
        double breedte;
        double diepte;

        @Override
        public String toString() {
            return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
        }

        public Zwembad() {
        }

        public Zwembad(double lengte, double breedte, double diepte) {
            this.lengte = lengte;
            this.breedte = breedte;
            this.diepte = diepte;
        }

        public double inhoud(){
            return this.breedte * this.lengte * this.diepte;
        }

        public double getBreedte() {
            return breedte;
        }

        public void setBreedte(double breedte) {
            this.breedte = breedte;
        }

        public double getLengte() {
            return lengte;
        }

        public void setLengte(double lengte) {
            this.lengte = lengte;
        }

        public double getDiepte() {
            return diepte;
        }

        public void setDiepte(double diepte) {
            this.diepte = diepte;
        }
    }

    public static void main(String[] arg) {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        System.out.println("BREEDTE: " + z1.getBreedte());
        System.out.println("LENGTE: " + z1.getLengte());
        System.out.println("DIEPTE: " + z1.getDiepte());
        System.out.println("BEREKENDE INHOUD: " + z1.inhoud());
        System.out.println();

        Zwembad z2 = new Zwembad();
        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);
        double inh = z2.inhoud();
        System.out.println("GEGEVENS ZWEMBAD: "+z2.toString());
        System.out.println("BEREKENDE INHOUD: " + z2.inhoud());
    }
}
