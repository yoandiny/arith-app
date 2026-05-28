package mg.yoan.file.hash;

import mg.yoan.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
