package org.example.HW5;

import java.util.List;
import java.util.logging.Logger;

public class PhoneBook {
    private List<Contact> contactsList;
    private static final Logger logger = Logger.getLogger("My logger");

    public List<Contact> getContactsList() {
        return contactsList;
    }

    public void addContact(Contact contact){
        if (getContact(contact.getNumber()) == null) {
            contactsList.add(contact);
            logger.info("Контакт добавлен");
        } else{
            logger.info("Контакт " + contact.getNumber() + " уже есть в списке");
        }

    }

    public void removeContact(Contact contact){
        if (getContact(contact.getNumber()) != null){
            contactsList.remove(contact);
            logger.info("Контакт " + contact.getNumber() + " успешно удалён");
            return;
        }
        logger.info("Контакт с указанным номером отсутствует");
    }

    public void updateContact(Contact contact){
        Contact c = getContact(contact.getNumber());
        if (getContact(contact.getNumber()) != null){
            c.setName(contact.getName());
            logger.info("Контакт " + c.getNumber() + " был успешно обновлён");
        }
    }

    public Contact getContact(String number) {
        for (Contact c: contactsList) {
            if (number.equals(c.getNumber())){
                logger.info("Выведена информация о контакте " + c.getNumber());
                return c;
            }
        }
        return null;
    }


}
