package b_selenium;

public class A4_Locator {

 /*
   8 diff types:

   ID NAME
   LinkText PartialLinkT
   TAG ClassName
   CSS XPATH

    Preferred Way: ID/name ( as they are unique )
	ID/Name not helpful if auto generated or dynamic generated ID , alternative is to use XPATH or CSS Selector
    CSS is faster in performance compare to XPATH

    Css
	  - single direction flow ( parent to child )
	  - css  do not support contains or textValue

    Xpath as powerfull tool
	  - to traverse backward, perform contains ops , textvalue

    combine CSS    textarea#menuItem1[placeholder='currentAddress']
    parent child   div > input[value=123]
    Hierarchy      select#oldSelect>option:nth-of-type(2)



	   CSS SELECTOR :
        ID -----------> cssSelector("#contact_link")      // cssSelector("[id=next]")
        classname ----> cssSelector(".homepage")
        tagname ------> cssSelector("P")
        Attr Exp -----> cssSelector("[href='navlink']")
        Multiple Atri-->cssSelector("[href='navlink'][name='log']")

        contains    --->cssSelector("input[innertext*='pass']")
        starts with --->cssSelector("input[id^='user']")
        start combo --->cssSelector("input[id*='pass'][name='log']")
        Ends With   --->cssSelector("input[id$='pass']")
                         ("a[title$='logo']")
        ---------------------------------------------------------------------
        Xpath:

        Absolute Xpath :  Select Element from Root Node   ( / )
        Relative Xpath :  Select Element from Current Node ( //)
        Xpath Axes: < Regular No ...not zero based index >

       **  NAL : chap 16/17 ( referrence )

        x-path axes :
            //div[@name='test']//following::a
            //div[@name='test']//preceding::a
            //div[@name='test']//following-sibling::a
            //div[@name='test']//preceding-sibling::a
            //div[@name='test']//ancestor::a
            //div[@name='test']//descendant::a
            //div[@name='test']//parent::a
            //div[@name='test']//child::a
            //div[@name='test']//self::a

        -findElement(new ByAll(By.id(),By.name(),By.xPath());
        -findElement(new ByIDorName("Submit");
        -findElement(new ByChained(By.id(parent1),By.name(child1),By.xPath(subchild1)));
*/

}
