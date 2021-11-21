package org.example.service;

import com.codenow.framework.rxjava.MdcPropagatingOnScheduleFunction;
import io.micronaut.runtime.Micronaut;
import io.reactivex.plugins.RxJavaPlugins;

/**
 * Application.
 */
public class Application {

    public static void main(String[] args) {
        RxJavaPlugins.setScheduleHandler(new MdcPropagatingOnScheduleFunction());
        Micronaut.run(Application.class);
    }
}
