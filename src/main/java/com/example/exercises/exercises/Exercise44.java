package com.example.exercises.exercises;

public class Exercise44 implements Exercise {
    @Override
    public void runExercise() {
        // TODO: Implement the exercise logic here
    ////////////////
    package arrays;
 
    public class TemperatureWeeks {
        
        private Double [] temperatures;
        
        private Double max;
        private Double minimun;
        private Double average;
        
        public Double getMax() {
            return max;
        }
     
        public void setMax(Double max) {
            this.max = max;
        }
     
        public Double getMinimun() {
            return minimun;
        }
     
        public void setMinimun(Double minimun) {
            this.minimun = minimun;
        }
     
        public Double getAverage() {
            return average;
        }
     
        public void setAverage(Double average) {
            this.average = average;
        }
        
        public Double[] getTemperatures() {
            return temperatures;
        }
     
        public void setTemperatures(Double[] temperatures) {
            this.temperatures = temperatures;
        }
     
        public TemperatureWeeks() {
            temperatures = new Double [7];
            this.max=null;
            this.minimun=null;
            this.average = null;
        }
        
        
        public void enterTemperature(Integer day, Double temperature) {
            
            
            
            if(day >= 0 && day<=7-1){
                    temperatures[day] = temperature;
            }else {
                throw new IllegalArgumentException("Invalid day. The day has to be greater than 0 and less than 7");
            }
        }
        
        public void findAverage() {
            Integer cont = 0;
            Double sum = 0.0;
            average = null;
            if(temperatures != null) {
                for(Double temperature : temperatures) {
                    sum+=temperature;
                    cont++;
                }
                 average = sum/cont;
            }else {
                throw new IllegalArgumentException("The arrangement should not be empty.");
            }
        }
        
        public void findMaximum() {
            max = null;
            if(temperatures != null) {
                for(Double temperature : temperatures) {
                    if(temperature != null) {
                        if(max == null || temperature > max) {
                            max = temperature;
                        }
                    }
                }
            }else {
                throw new IllegalArgumentException("The arrangement should not be empty.");
            }
        }
        
        public void findMinimun() {
            minimun = null;
            if(temperatures != null) {
                for(Double temperature : temperatures) {
                    if(temperature != null) {
                        if(minimun == null || temperature < minimun) {
                            minimun = temperature;
                        }
                    }
                }
            }else {
                throw new IllegalArgumentException("The arrangement should not be empty.");
            }
        }
        
        public void viewInformation() {
            System.out.println("Maximu temperature: " + getMax() + " " + "Minimum temperature: "  + " " + getMinimun() + " " + "Average temperature: " + getAverage());
        }
    }


    /////////////////////////////////////


    package arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        TemperatureWeeks temperatureWeeks = new TemperatureWeeks();

        for (Integer day = 0; day <= 6; day++) {
            System.out.println("Enter the temperature of the day : " + (day + 1));
            Double temperature = scanner.nextDouble();
            temperatureWeeks.enterTemperature(day, temperature);
        }

        temperatureWeeks.findAverage();
        temperatureWeeks.findMinimun();
        temperatureWeeks.findMaximum();
        temperatureWeeks.viewInformation();

        scanner.close();
    }

}

}
