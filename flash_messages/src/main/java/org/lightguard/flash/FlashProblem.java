package org.lightguard.flash;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class FlashProblem implements Serializable {
    public String showMessages()
    {
        final FacesContext context = FacesContext.getCurrentInstance();
        Flash f = context.getExternalContext().getFlash();
        f.setKeepMessages(true);

        FacesMessage msg;

        for (int i = 1; i < 3; i++)
        {
            msg = new FacesMessage(String.format("Message %d", i));
            context.addMessage(null, msg);
        }
        return "messages?faces-redirect=true";
    }
}
