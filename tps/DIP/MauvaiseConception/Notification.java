package tps.DIP.MauvaiseConception;

public class Notification {

  private EmailService emailService;

  Notification() {
    this.emailService = new EmailService();
  }

  void notify(String message) {
    emailService.sendMessage(message);
  }
}
