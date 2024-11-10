package tps.DIP.BonneConception;

public class Notification {
  private MessageService messageService;

  Notification(MessageService messageService) {
    this.messageService = messageService;
  }

  void notify(String message) {
    messageService.sendMessage(message);
  }
}
