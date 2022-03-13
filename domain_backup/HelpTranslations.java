package com.demo.spring.service.domain;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "HelpTranslations.findAll", query = "select o from HelpTranslations o") })
@Table(name = "HELP_TRANSLATIONS")
public class HelpTranslations implements Serializable {
    private static final long serialVersionUID = 1814569025409676153L;
    @Column(name = "CREATED_BY", nullable = false, length = 60)
    private String createdBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creationDate;
    @Column(name = "HELP_ID", nullable = false)
    private Long helpId;
    @Column(name = "HELP_TEXT", nullable = false, length = 2000)
    private String helpText;
    @Id
    @Column(name = "HELP_TRANSLATIONS_ID", nullable = false)
    private Long helpTranslationsId;
    @Column(name = "HELP_USAGE", nullable = false, length = 200)
    private String helpUsage;
    @Column(nullable = false, length = 30)
    private String language;
    @Column(name = "LAST_UPDATED_BY", nullable = false, length = 60)
    private String lastUpdatedBy;
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Date lastUpdateDate;
    @Column(name = "OBJECT_VERSION_ID", nullable = false)
    private Long objectVersionId;
    @Column(name = "SOURCE_LANGUAGE", nullable = false, length = 15)
    private String sourceLanguage;

    public HelpTranslations() {
    }

    public HelpTranslations(String createdBy, Date creationDate, Long helpId, String helpText, Long helpTranslationsId,
                            String helpUsage, String language, Date lastUpdateDate, String lastUpdatedBy,
                            Long objectVersionId, String sourceLanguage) {
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.helpId = helpId;
        this.helpText = helpText;
        this.helpTranslationsId = helpTranslationsId;
        this.helpUsage = helpUsage;
        this.language = language;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.objectVersionId = objectVersionId;
        this.sourceLanguage = sourceLanguage;
    }


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getHelpId() {
        return helpId;
    }

    public void setHelpId(Long helpId) {
        this.helpId = helpId;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public Long getHelpTranslationsId() {
        return helpTranslationsId;
    }

    public void setHelpTranslationsId(Long helpTranslationsId) {
        this.helpTranslationsId = helpTranslationsId;
    }

    public String getHelpUsage() {
        return helpUsage;
    }

    public void setHelpUsage(String helpUsage) {
        this.helpUsage = helpUsage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Long getObjectVersionId() {
        return objectVersionId;
    }

    public void setObjectVersionId(Long objectVersionId) {
        this.objectVersionId = objectVersionId;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName() + "@" + Integer.toHexString(hashCode()));
        buffer.append('[');
        buffer.append("createdBy=");
        buffer.append(getCreatedBy());
        buffer.append(',');
        buffer.append("creationDate=");
        buffer.append(getCreationDate());
        buffer.append(',');
        buffer.append("helpId=");
        buffer.append(getHelpId());
        buffer.append(',');
        buffer.append("helpText=");
        buffer.append(getHelpText());
        buffer.append(',');
        buffer.append("helpTranslationsId=");
        buffer.append(getHelpTranslationsId());
        buffer.append(',');
        buffer.append("helpUsage=");
        buffer.append(getHelpUsage());
        buffer.append(',');
        buffer.append("language=");
        buffer.append(getLanguage());
        buffer.append(',');
        buffer.append("lastUpdateDate=");
        buffer.append(getLastUpdateDate());
        buffer.append(',');
        buffer.append("lastUpdatedBy=");
        buffer.append(getLastUpdatedBy());
        buffer.append(',');
        buffer.append("objectVersionId=");
        buffer.append(getObjectVersionId());
        buffer.append(',');
        buffer.append("sourceLanguage=");
        buffer.append(getSourceLanguage());
        buffer.append(']');
        return buffer.toString();
    }
}
