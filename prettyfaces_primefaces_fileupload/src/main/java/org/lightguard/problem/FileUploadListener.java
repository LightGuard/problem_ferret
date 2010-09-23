package org.lightguard.problem;

import org.primefaces.event.FileUploadEvent;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class FileUploadListener implements Serializable {
    public void onFileUpload(FileUploadEvent event) {
        FacesMessage msg = new FacesMessage(String.format("File '%s' uploaded", event.getFile().getFileName()));
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
