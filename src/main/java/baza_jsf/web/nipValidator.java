package baza_jsf.web;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("nipValidator")
public class nipValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		
		String nip = (String) value;
		
		if (nip.length() != 10) {
			FacesMessage message = new FacesMessage();
			message.setDetail("Numer NIP musi składać się z 10 cyfr");
			message.setSummary("Numer NIP musi składać się z 10 cyfr");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}
}
