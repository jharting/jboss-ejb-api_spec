/*
 * JBoss, the OpenSource EJB server
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package javax.ejb;

/**
 *
 * @author <a href="mailto:bill@jboss.org">Bill Burke</a>
 * @version $Revision$
 */
public enum TxType
{
   MANDATORY,
   REQUIRED,
   REQUIRESNEW,
   SUPPORTS,
   NOTSUPPORTED,
   NEVER
}