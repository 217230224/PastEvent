import java.time.LocalDate;

public class PastEvents extends Event {
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost = 10_000;
    
    public PastEvents(String eventName, String eventLocation, LocalDate eventStartDate, LocalDate eventEndDate, String paymentStatus, boolean requiresExtension) {
        super();
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
    }
    
    public String getPaymentDetails() {
        return "The event cost was " + eventCost + " and the payment status is " + paymentStatus + ". The Customer requires extension: " + requiresExtension + ".";
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEvent Start Date: " + eventStartDate + "\nEvent End Date: " + eventEndDate + "\nPayment Status: " + paymentStatus + "\nRequires Extension: " + requiresExtension;
    }
}