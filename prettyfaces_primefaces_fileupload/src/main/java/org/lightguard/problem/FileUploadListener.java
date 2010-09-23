package org.lightguard.problem;

import org.primefaces.event.FileUploadEvent;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Model
public class FileUploadListener {
    public void onFileUpload(FileUploadEvent event)
    {
        FacesMessage msg = new FacesMessage(String.format("File '%s' uploaded", event.getFile().getFileName()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
