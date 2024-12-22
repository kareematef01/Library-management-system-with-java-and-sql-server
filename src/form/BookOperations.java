/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package form;

/**
 *
 * @author Kimo
 */
//Decorator
public interface BookOperations {
    void perform();
}

 class BasicBookOperation implements BookOperations {
    public void perform() {
        System.out.println("Basic book operation performed.");
    }
}

 class ReserveBookDecorator implements BookOperations {
    private BookOperations bookOperation;

    public ReserveBookDecorator(BookOperations bookOperation) {
        this.bookOperation = bookOperation;
    }

    public void perform() {
        bookOperation.perform();
        System.out.println("Book reserved.");
    }
}

 class CancelReservationDecorator implements BookOperations {
    private BookOperations bookOperation;

    public CancelReservationDecorator(BookOperations bookOperation) {
        this.bookOperation = bookOperation;
    }

    @Override
    public void perform() {
        bookOperation.perform();
        System.out.println("Reservation cancelled.");
    }
}


