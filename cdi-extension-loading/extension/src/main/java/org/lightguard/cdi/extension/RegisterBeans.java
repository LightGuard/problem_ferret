/**
 *
 * @author <a href="http://community.jboss.org/people/LightGuard">Jason Porter</a>
 */
package org.lightguard.cdi.extension;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.BeforeBeanDiscovery;
import javax.enterprise.inject.spi.Extension;

import org.lightguard.cdi.extension.bean.HelloService;

public class RegisterBeans implements Extension
{
    void beforeBeanDiscovery( @Observes BeforeBeanDiscovery event, BeanManager beanManager )
    {
        event.addAnnotatedType( beanManager.createAnnotatedType( HelloService.class ) );
    }
}
