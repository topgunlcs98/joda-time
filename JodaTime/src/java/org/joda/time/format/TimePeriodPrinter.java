/*
 * Joda Software License, Version 1.0
 *
 *
 * Copyright (c) 2001-2004 Stephen Colebourne.  
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Joda project (http://www.joda.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The name "Joda" must not be used to endorse or promote products
 *    derived from this software without prior written permission. For
 *    written permission, please contact licence@joda.org.
 *
 * 5. Products derived from this software may not be called "Joda",
 *    nor may "Joda" appear in their name, without prior written
 *    permission of the Joda project.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE JODA AUTHORS OR THE PROJECT
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Joda project and was originally 
 * created by Stephen Colebourne <scolebourne@joda.org>. For more
 * information on the Joda project, please see <http://www.joda.org/>.
 */
package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;

import org.joda.time.ReadableTimePeriod;

/**
 * Defines an interface for creating textual representations of time periods.
 *
 * @author Brian S O'Neill
 * @see TimePeriodFormatter
 * @see TimePeriodFormatterBuilder
 * @see TimePeriodFormat
 * @since 1.0
 */
public interface TimePeriodPrinter {

    /**
     * Returns the amount of fields from the given duration that this printer
     * will print.
     * 
     * @param period  the period to use
     * @return amount of fields printed
     */
    int countFieldsToPrint(ReadableTimePeriod period);

    /**
     * Returns the amount of fields from the given duration that this printer
     * will print.
     * 
     * @param period  the period to use
     * @param stopAt stop counting at this value
     * @return amount of fields printed
     */
    int countFieldsToPrint(ReadableTimePeriod period, int stopAt);

    /**
     * Returns the exact number of characters produced for the given duration.
     * 
     * @param period  the period to use
     * @return the estimated length
     */
    int calculatePrintedLength(ReadableTimePeriod period);

    //-----------------------------------------------------------------------
    /**
     * Prints a ReadableTimePeriod to a StringBuffer.
     *
     * @param buf  the formatted period is appended to this buffer
     * @param period  the period to format
     */
    void printTo(StringBuffer buf, ReadableTimePeriod period);

    /**
     * Prints a ReadableTimePeriod to a Writer.
     *
     * @param out  the formatted period is written out
     * @param period  the period to format
     */
    void printTo(Writer out, ReadableTimePeriod period) throws IOException;

    /**
     * Prints a ReadableTimePeriod to a new String.
     *
     * @param period  the period to format
     * @return the printed result
     */
    String print(ReadableTimePeriod period);

}