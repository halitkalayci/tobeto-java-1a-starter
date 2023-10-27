package org.example.workshop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Workshop");

        BaseRepository mongoDbRepository = new MongoDbRepository();
        mongoDbRepository.add();
        mongoDbRepository.delete();
        mongoDbRepository.update();
    }
    // BaseClass
    // IBaseRepository => .NET'da daha fazla
}
