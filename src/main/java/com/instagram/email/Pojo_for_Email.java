package com.instagram.email;

import java.util.ArrayList;

public class Pojo_for_Email {
    public class CreatedAt{
        public Long milliseconds;
    }

    public class Id{
        public String oid;
    }

    public class MailAttachments{
        public ArrayList<Object> attachment;
    }


    public Id _id;
    public CreatedAt createdAt;
    public String mail_id;
    public String mail_address_id;
    public String mail_from;
    public String mail_subject;
    public String mail_preview;
    public String mail_text_only;
    public String mail_text;
    public String mail_html;
    public Double mail_timestamp;
    public Integer mail_attachments_count;
    public MailAttachments mail_attachments;

    public Pojo_for_Email(Id _id, CreatedAt createdAt, String mail_id, String mail_address_id,
                     String mail_from, String mail_subject, String mail_preview, String mail_text_only,
                     String mail_text, String mail_html, Double mail_timestamp, Integer mail_attachments_count,
                     MailAttachments mail_attachments) {
        this._id = _id;
        this.createdAt = createdAt;
        this.mail_id = mail_id;
        this.mail_address_id = mail_address_id;
        this.mail_from = mail_from;
        this.mail_subject = mail_subject;
        this.mail_preview = mail_preview;
        this.mail_text_only = mail_text_only;
        this.mail_text = mail_text;
        this.mail_html = mail_html;
        this.mail_timestamp = mail_timestamp;
        this.mail_attachments_count = mail_attachments_count;
        this.mail_attachments = mail_attachments;
    }

    public Id get_id() {return _id;}

    public CreatedAt getCreatedAt() {
        return createdAt;
    }

    public String getMail_id() {
        return mail_id;
    }

    public String getMail_address_id() {
        return mail_address_id;
    }

    public String getMail_from() {
        return mail_from;
    }

    public String getMail_subject() {
        return mail_subject;
    }

    public String getMail_preview() {
        return mail_preview;
    }

    public String getMail_text_only() {
        return mail_text_only;
    }

    public String getMail_text() {
        return mail_text;
    }

    public String getMail_html() {
        return mail_html;
    }

    public Double getMail_timestamp() {
        return mail_timestamp;
    }

    public Integer getMail_attachments_count() {
        return mail_attachments_count;
    }

    public MailAttachments getMail_attachments() {
        return mail_attachments;
    }
}
