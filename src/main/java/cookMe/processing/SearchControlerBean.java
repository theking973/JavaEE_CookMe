package cookMe.processing;

import cookMe.dao.instance.RecipesDao;
import cookMe.model.ListRecipeTypeBean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.util.List;
import java.util.Map;

/**
 * Created by djbranbran on 25/05/16.
 */
@ManagedBean
@ApplicationScoped
public class SearchControlerBean {


    private List<String> listType;

    private RecipesDao recipeDao;


    public SearchControlerBean() {
    }

    public String searchRecipe() {
        ListRecipeTypeBean listType = new ListRecipeTypeBean();
        listType.update();

        //récupère l'espace de mémoire de JSF
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> requestMap = externalContext.getRequestMap();
        //place la liste de recette dans l'espace de mémoire de JSF
        requestMap.put("listType", listType);
        return "search.jsf";
    }

    public List<String> getListType() {
        return listType;
    }

    public void setListType(List<String> listType) {
        this.listType = listType;
    }

}