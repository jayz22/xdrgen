package MyXDR;

import java.io.IOException;

/**
 * Common parent interface for all generated classes. 
 */
interface XdrElement {
    void encode(XdrDataOutputStream stream) throws IOException;
}
