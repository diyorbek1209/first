        package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendVenue;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.text;

        public class MyBot extends TelegramLongPollingBot {
    public MyBot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        long chatId = update.getMessage().getChatId();
        System.out.println(chatId);

        if (update.getMessage().getText().equals("\uD83D\uDCDD Izoh qoldirish")) {
            SendMessage message = new SendMessage();
            message.setText("assalomu alaykum" + update.getMessage().getFrom().getFirstName());
            message.setChatId(chatId);

            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();

            KeyboardRow row = new KeyboardRow();
            KeyboardButton contact = new KeyboardButton();
            contact.setRequestContact(true);
            contact.setText("Raqamni ulashish");
            KeyboardRow row1 = new KeyboardRow();
            KeyboardButton bekorQilish = new KeyboardButton();
            bekorQilish.setText("Bekor qilish ❌");

            row1.add(bekorQilish);
            row.add(contact);
            rowList.add(row);
            rowList.add(row1);
            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);

            message.setReplyMarkup(markup);
            message.setChatId(chatId);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (text.equals("\uD83D\uDCCC Mening joylashuvim")) {

            SendMessage message = new SendMessage();
            message.setText("Manzillingizni jo'nating " + update.getMessage().getFrom().getFirstName());
            message.setChatId(chatId);

            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rawList = new ArrayList<>();
            KeyboardRow raw = new KeyboardRow();
            KeyboardButton Location = new KeyboardButton();
            Location.setRequestLocation(true);
            Location.setText("manzilni ulashish");
            raw.add(Location);
            rawList.add(raw);
            markup.setKeyboard(rawList);
            markup.setResizeKeyboard(true);
            message.setReplyMarkup(markup);
            message.setChatId(chatId);

            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }


        }
        if (update.getMessage().getText().equals("/start") ||
                update.getMessage().getText().equals("⬅️\uFE0F orqaga") ||
                update.getMessage().getText().equals("Bekor qilish ❌")) {


            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();


            KeyboardButton search = new KeyboardButton();
            search.setText("\uD83D\uDD0D Dorilarni izlash");
            KeyboardButton help = new KeyboardButton();
            help.setText("Qanday qo'llash mumkin ❓");
            KeyboardButton comment = new KeyboardButton();
            comment.setText("\uD83D\uDCDD Izoh qoldirish");
            KeyboardButton info = new KeyboardButton();
            info.setText("Axborot \uD83D\uDCD6");
            KeyboardButton til = new KeyboardButton();
            til.setText("Рус.\uD83C\uDDF7\uD83C\uDDFA/\uD83C\uDDFA\uD83C\uDDFF O'zb.");

            row1.add(search);
            row2.add(help);
            row3.add(comment);
            row3.add(info);
            row4.add(til);

            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);
            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);

            SendMessage message = new SendMessage();
            message.setText("tanlang");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        } else if (update.getMessage().getText().equals("\uD83D\uDD0D Dorilarni izlash")) {


            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardRow row3 = new KeyboardRow();
            KeyboardRow row4 = new KeyboardRow();
            KeyboardRow row5 = new KeyboardRow();
            KeyboardRow row6 = new KeyboardRow();
            KeyboardRow row7 = new KeyboardRow();
            KeyboardRow row8 = new KeyboardRow();
            KeyboardRow row9 = new KeyboardRow();
            KeyboardRow row10 = new KeyboardRow();
            KeyboardRow row11 = new KeyboardRow();

            KeyboardButton pin = new KeyboardButton();
            pin.setText("\uD83D\uDCCC Mening joylashuvim");
            KeyboardButton uzb = new KeyboardButton();
            uzb.setText("\uD83C\uDDFA\uD83C\uDDFF O'zbekiston");
            KeyboardButton toshkent = new KeyboardButton();
            toshkent.setText("toshkent viloyati");
            KeyboardButton andijon = new KeyboardButton();
            andijon.setText("andijon viloyati");
            KeyboardButton buxoro = new KeyboardButton();
            buxoro.setText("buxoro viloyati");
            KeyboardButton fargona = new KeyboardButton();
            fargona.setText("farg'ona viloyati");
            KeyboardButton jizzax = new KeyboardButton();
            jizzax.setText("jizzax viloyati");
            KeyboardButton Namangan = new KeyboardButton();
            Namangan.setText("Namangan viloyati");
            KeyboardButton navoiy = new KeyboardButton();
            navoiy.setText("navoiy viloyati");
            KeyboardButton Qashqadaryo = new KeyboardButton();
            Qashqadaryo.setText("Qashqadaryo viloyati");
            KeyboardButton qoraqalpoq = new KeyboardButton();
            qoraqalpoq.setText("Qoraqalpog'iston Respublikasi");
            KeyboardButton samarqand = new KeyboardButton();
            samarqand.setText("samarqand viloyati");
            KeyboardButton sirdaryo = new KeyboardButton();
            sirdaryo.setText("sirdaryo viloyati");
            KeyboardButton surxandaryo = new KeyboardButton();
            surxandaryo.setText("surxandaryo viloyati");
            KeyboardButton toshkentw = new KeyboardButton();
            toshkentw.setText("toshkent shahri");
            KeyboardButton xorazm = new KeyboardButton();
            xorazm.setText("xorazm viloyati");
            KeyboardButton back = new KeyboardButton();
            back.setText("⬅️\uFE0F orqaga");


            row1.add(pin);
            row2.add(uzb);
            row3.add(toshkent);
            row4.add(andijon);
            row4.add(buxoro);
            row5.add(fargona);
            row5.add(jizzax);
            row6.add(Namangan);
            row6.add(navoiy);
            row7.add(Qashqadaryo);
            row7.add(qoraqalpoq);
            row8.add(samarqand);
            row8.add(sirdaryo);
            row9.add(surxandaryo);
            row9.add(toshkentw);
            row10.add(xorazm);
            row11.add(back);


            rowList.add(row1);
            rowList.add(row2);
            rowList.add(row3);
            rowList.add(row4);
            rowList.add(row5);
            rowList.add(row6);
            rowList.add(row7);
            rowList.add(row8);
            rowList.add(row9);
            rowList.add(row10);
            rowList.add(row11);
            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);

            SendMessage message = new SendMessage();
            message.setText("tanlang");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
//            diyorbek
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (update.getMessage().getText().equals("\uD83D\uDCDD Izoh qoldirish")) {
            if (update.getMessage().hasContact()) {
                Contact contact = update.getMessage().getContact();
                String phoneNumber = contact.getPhoneNumber();
                String firstName = contact.getFirstName();
                SendMessage message = new SendMessage();
                message.setText(phoneNumber + "=>" + firstName);
                message.setChatId("5295269965");

                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            } else if (update.getMessage().getText().equals("Qanday qo'llash mumkin ❓")) {
                InputFile file = new InputFile(new File("C:\\Users\\HP Victus\\Desktop\\info5.mp4"));
                SendVideo sendVideo = new SendVideo();
                sendVideo.setVideo(file);
                sendVideo.setChatId(chatId);
                try {
                    execute(sendVideo);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            } else if (update.getMessage().getText().equals("\uD83D\uDCCC Mening joylashuvim")) {
                if (update.getMessage().hasLocation()) {
                    Message message = new Message();


                    System.out.println(1);
                    Location location1 = update.getMessage().getLocation();
                    System.out.println(1);
                    Double latitude = location1.getLatitude();
                    Double longitude = location1.getLongitude();


                    SendVenue venue = new SendVenue();
                    venue.setTitle( update.getMessage().getFrom().getFirstName() + " joylashuvingiz");
                    venue.setLongitude(longitude);
                    venue.setLatitude(latitude);

                    venue.setAddress("adress");


                    venue.setChatId("5295269965");




                    try {
                        execute(venue);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }


                }
            }


        }


        }

    @Override
    public String getBotUsername() {
        return "ArzonApteka1254bot";
    }
}




