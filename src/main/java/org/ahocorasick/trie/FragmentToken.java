package org.ahocorasick.trie;

public class FragmentToken extends Token {

    public FragmentToken(final String fragment) {
        super(fragment);
    }

    @Override
    public boolean isMatch() {
        return false;
    }

    @Override
    public Emit getEmit() {
        return null;
    }

}
