// .ui.xml template last modified: 1681138260954
package it.unibo.sweng.simplegwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class HomePage_HomePageUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, it.unibo.sweng.simplegwt.client.HomePage>, it.unibo.sweng.simplegwt.client.HomePage.HomePageUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<nav class='navbar navbar-expand-lg navbar-light bg-light'> <span id='{0}'></span> <button aria-controls='navbarTogglerDemo02' aria-expanded='false' aria-label='Toggle navigation' class='navbar-toggler' data-target='#navbarTogglerDemo02' data-toggle='collapse' type='button'> <span class='navbar-toggler-icon'></span> </button> <div class='collapse navbar-collapse' id='navbarTogglerDemo02'> <ul class='navbar-nav mr-auto mt-2 mt-lg-0'> <li class='nav-item active'> <span id='{1}'></span> </li> <li class='nav-item'> <span id='{2}'></span> </li> <li class='nav-item'> <span id='{3}'></span> </li> </ul> <form class='form-inline my-2 my-lg-0'> <span id='{4}'></span>  </form> </div> </nav>  <div id='Informazioni'> <h2>Cenni Storici</h2> <p>Le origini della nostra Università risalgono al 1175 circa, quando Pillio da Medicina, dottore in leggi attivo a Bologna, venne invitato a Modena dall'élite dirigente del Comune per aprire una scuola di formazione giuridica incentrata sul diritto romano.<br>Si tratta dunque di una delle più antiche Università europee, dopo quella di Bologna e di Parigi.</p>  <h2>Sede</h2> <dl id='Sedi' style='list-style-type:circle'> <dt> Sede di Modena</dt> <dt> Sede di Reggio Emilia</dt>  </dl> </div>   <div id='immagine'> <img src='unimore.jpg'> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final it.unibo.sweng.simplegwt.client.HomePage owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final it.unibo.sweng.simplegwt.client.HomePage owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.doClickHome((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final it.unibo.sweng.simplegwt.client.HomePage owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenBundle) GWT.create(it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();
        get_domId2Element().get();
        get_domId3Element().get();
        get_domId4Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_btnHome(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnContatti(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnDipartimentoModena(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnDipartimentoReggio(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_btnLogin(), get_domId4Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for btnHome called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnHome() {
      return build_btnHome();
    }
    private com.google.gwt.user.client.ui.Button build_btnHome() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnHome = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnHome.setText("HOME");
      btnHome.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.btnHome = btnHome;

      return btnHome;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for btnContatti called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnContatti() {
      return build_btnContatti();
    }
    private com.google.gwt.user.client.ui.Button build_btnContatti() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnContatti = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnContatti.setText("CONTATTI");

      return btnContatti;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for btnDipartimentoModena called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnDipartimentoModena() {
      return build_btnDipartimentoModena();
    }
    private com.google.gwt.user.client.ui.Button build_btnDipartimentoModena() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnDipartimentoModena = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnDipartimentoModena.setText("DIPARTIMENTI MODENA");

      return btnDipartimentoModena;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for btnDipartimentoReggio called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnDipartimentoReggio() {
      return build_btnDipartimentoReggio();
    }
    private com.google.gwt.user.client.ui.Button build_btnDipartimentoReggio() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnDipartimentoReggio = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnDipartimentoReggio.setText("DIPARTIMENTI REGGIO EMILIA");

      return btnDipartimentoReggio;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.

      return domId3Element;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId4;
    }

    /**
     * Getter for btnLogin called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_btnLogin() {
      return build_btnLogin();
    }
    private com.google.gwt.user.client.ui.Button build_btnLogin() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button btnLogin = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      btnLogin.setText("LOGIN");

      return btnLogin;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.

      return domId4Element;
    }
  }
}
