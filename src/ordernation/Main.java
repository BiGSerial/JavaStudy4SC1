package ordernation;

import data.Item;
import ordernation.TypeVector;

public class Main {
    public static void main(String[] args) {
        TypeVector typeVector = new TypeVector(20);
        
        // Inserir dados
        typeVector.insertData(new Item(5));
        typeVector.insertData(new Item(3));
        typeVector.insertData(new Item(8));
        typeVector.insertData(new Item(1));
        typeVector.insertData(new Item(6));
        typeVector.insertData(new Item(8));
        typeVector.insertData(new Item(12));
        typeVector.insertData(new Item(23));
        typeVector.insertData(new Item(14));
        typeVector.insertData(new Item(63));
        typeVector.insertData(new Item(51));
        typeVector.insertData(new Item(33));
        typeVector.insertData(new Item(84));
        typeVector.insertData(new Item(16));
        typeVector.insertData(new Item(63));
        typeVector.insertData(new Item(25));
        typeVector.insertData(new Item(33));
        typeVector.insertData(new Item(48));
        typeVector.insertData(new Item(51));
        typeVector.insertData(new Item(26));
        
        // Exibir antes da ordenação
        System.out.println("Antes da ordenação:");
        System.out.println(typeVector);
        
        // Ordenar
        typeVector.directSelection();
        
        // Exibir depois da ordenação
        System.out.println("Depois da ordenação:");
        System.out.println(typeVector);
    }
}

