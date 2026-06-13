package com.cognizant.Builder;

public class Computer {
  
    private final String cpu;
    private final String RAM;
    private final String storage;
    private final String graphics;
	
   
    private Computer(String cpu, String RAM, String storage, String graphics) {
        this.cpu = cpu;
        this.RAM = RAM;
        this.storage = storage;
        this.graphics = graphics;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + 
               ", RAM=" + RAM + 
               ", Storage=" + storage + 
               ", Graphics=" + graphics + "]"; 
    }
    
   
    public static class ComputerBuilder {
     
        private final String RAM;
        private final String storage;
		
        private String cpu;
        private String graphics;
		
       
        public ComputerBuilder(String RAM, String storage) {		
            this.RAM = RAM;
            this.storage = storage;
        }
		
       
        public ComputerBuilder enableGraphics(String graphics) {
            this.graphics = graphics;
            return this;
        }
		
        public ComputerBuilder customCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }
		
       
        public Computer build() {
            return new Computer(this.cpu, this.RAM, this.storage, this.graphics);
        }
    }
}