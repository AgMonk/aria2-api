package com.gin.aria2.params;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 *
 */
@Data
public class Aria2Option {
    @JSONField(alternateNames = "allow-overwrite", name = "allow-overwrite")
    String allowOverwrite;
    @JSONField(alternateNames = "allow-piece-length-change", name = "allow-piece-length-change")
    String allowPieceLengthChange;
    @JSONField(alternateNames = "always-resume", name = "always-resume")
    String alwaysResume;
    @JSONField(alternateNames = "async-dns", name = "async-dns")
    String asyncDns;
    @JSONField(alternateNames = "auto-file-renaming", name = "auto-file-renaming")
    String autoFileRenaming;
    @JSONField(alternateNames = "bt-enable-hook-after-hash-check", name = "bt-enable-hook-after-hash-check")
    String btEnableHookAfterHashCheck;
    @JSONField(alternateNames = "bt-enable-lpd", name = "bt-enable-lpd")
    String btEnableLpd;
    @JSONField(alternateNames = "bt-force-encryption", name = "bt-force-encryption")
    String btForceEncryption;
    @JSONField(alternateNames = "bt-hash-check-seed", name = "bt-hash-check-seed")
    String btHashCheckSeed;
    @JSONField(alternateNames = "bt-load-saved-metadata", name = "bt-load-saved-metadata")
    String btLoadSavedMetadata;
    @JSONField(alternateNames = "bt-max-peers", name = "bt-max-peers")
    String btMaxPeers;
    @JSONField(alternateNames = "bt-metadata-only", name = "bt-metadata-only")
    String btMetadataOnly;
    @JSONField(alternateNames = "bt-min-crypto-level", name = "bt-min-crypto-level")
    String btMinCryptoLevel;
    @JSONField(alternateNames = "bt-remove-unselected-file", name = "bt-remove-unselected-file")
    String btRemoveUnselectedFile;
    @JSONField(alternateNames = "bt-request-peer-speed-limit", name = "bt-request-peer-speed-limit")
    String btRequestPeerSpeedLimit;
    @JSONField(alternateNames = "bt-require-crypto", name = "bt-require-crypto")
    String btRequireCrypto;
    @JSONField(alternateNames = "bt-save-metadata", name = "bt-save-metadata")
    String btSaveMetadata;
    @JSONField(alternateNames = "bt-seed-unverified", name = "bt-seed-unverified")
    String btSeedUnverified;
    @JSONField(alternateNames = "bt-stop-timeout", name = "bt-stop-timeout")
    String btStopTimeout;
    @JSONField(alternateNames = "bt-tracker-connect-timeout", name = "bt-tracker-connect-timeout")
    String btTrackerConnectTimeout;
    @JSONField(alternateNames = "bt-tracker-interval", name = "bt-tracker-interval")
    String btTrackerInterval;
    @JSONField(alternateNames = "bt-tracker-timeout", name = "bt-tracker-timeout")
    String btTrackerTimeout;
    @JSONField(alternateNames = "check-integrity", name = "check-integrity")
    String checkIntegrity;
    @JSONField(alternateNames = "conditional-get", name = "conditional-get")
    String conditionalGet;
    @JSONField(alternateNames = "connect-timeout", name = "connect-timeout")
    String connectTimeout;
    @JSONField(alternateNames = "content-disposition-default-utf8", name = "content-disposition-default-utf8")
    String contentDispositionDefaultUtf8;
    @JSONField(alternateNames = "continue", name = "continue")
    String continues;
    @JSONField(alternateNames = "dir", name = "dir")
    String dir;
    @JSONField(alternateNames = "dry-run", name = "dry-run")
    String dryRun;
    @JSONField(alternateNames = "enable-http-keep-alive", name = "enable-http-keep-alive")
    String enableHttpKeepAlive;
    @JSONField(alternateNames = "enable-http-pipelining", name = "enable-http-pipelining")
    String enableHttpPipelining;
    @JSONField(alternateNames = "enable-mmap", name = "enable-mmap")
    String enableMmap;
    @JSONField(alternateNames = "enable-peer-exchange", name = "enable-peer-exchange")
    String enablePeerExchange;
    @JSONField(alternateNames = "file-allocation", name = "file-allocation")
    String fileAllocation;
    @JSONField(alternateNames = "follow-metalink", name = "follow-metalink")
    String followMetalink;
    @JSONField(alternateNames = "follow-torrent", name = "follow-torrent")
    String followTorrent;
    @JSONField(alternateNames = "force-save", name = "force-save")
    String forceSave;
    @JSONField(alternateNames = "ftp-pasv", name = "ftp-pasv")
    String ftpPasv;
    @JSONField(alternateNames = "ftp-reuse-connection", name = "ftp-reuse-connection")
    String ftpReuseConnection;
    @JSONField(alternateNames = "ftp-type", name = "ftp-type")
    String ftpType;
    @JSONField(alternateNames = "hash-check-only", name = "hash-check-only")
    String hashCheckOnly;
    @JSONField(alternateNames = "http-accept-gzip", name = "http-accept-gzip")
    String httpAcceptGzip;
    @JSONField(alternateNames = "http-auth-challenge", name = "http-auth-challenge")
    String httpAuthChallenge;
    @JSONField(alternateNames = "http-no-cache", name = "http-no-cache")
    String httpNoCache;
    @JSONField(alternateNames = "lowest-speed-limit", name = "lowest-speed-limit")
    String lowestSpeedLimit;
    @JSONField(alternateNames = "max-connection-per-server", name = "max-connection-per-server")
    String maxConnectionPerServer;
    @JSONField(alternateNames = "max-download-limit", name = "max-download-limit")
    String maxDownloadLimit;
    @JSONField(alternateNames = "max-file-not-found", name = "max-file-not-found")
    String maxFileNotFound;
    @JSONField(alternateNames = "max-mmap-limit", name = "max-mmap-limit")
    String maxMmapLimit;
    @JSONField(alternateNames = "max-resume-failure-tries", name = "max-resume-failure-tries")
    String maxResumeFailureTries;
    @JSONField(alternateNames = "max-tries", name = "max-tries")
    String maxTries;
    @JSONField(alternateNames = "max-upload-limit", name = "max-upload-limit")
    String maxUploadLimit;
    @JSONField(alternateNames = "metalink-enable-unique-protocol", name = "metalink-enable-unique-protocol")
    String metalinkEnableUniqueProtocol;
    @JSONField(alternateNames = "metalink-preferred-protocol", name = "metalink-preferred-protocol")
    String metalinkPreferredProtocol;
    @JSONField(alternateNames = "min-split-size", name = "min-split-size")
    String minSplitSize;
    @JSONField(alternateNames = "no-file-allocation-limit", name = "no-file-allocation-limit")
    String noFileAllocationLimit;
    @JSONField(alternateNames = "no-netrc", name = "no-netrc")
    String noNetrc;
    @JSONField(alternateNames = "parameterized-uri", name = "parameterized-uri")
    String parameterizedUri;
    @JSONField(alternateNames = "pause-metadata", name = "pause-metadata")
    String pauseMetadata;
    @JSONField(alternateNames = "piece-length", name = "piece-length")
    String pieceLength;
    @JSONField(alternateNames = "proxy-method", name = "proxy-method")
    String proxyMethod;
    @JSONField(alternateNames = "realtime-chunk-checksum", name = "realtime-chunk-checksum")
    String realtimeChunkChecksum;
    @JSONField(alternateNames = "referer", name = "referer")
    String referer;
    @JSONField(alternateNames = "remote-time", name = "remote-time")
    String remoteTime;
    @JSONField(alternateNames = "remove-control-file", name = "remove-control-file")
    String removeControlFile;
    @JSONField(alternateNames = "retry-wait", name = "retry-wait")
    String retryWait;
    @JSONField(alternateNames = "reuse-uri", name = "reuse-uri")
    String reuseUri;
    @JSONField(alternateNames = "rpc-save-upload-metadata", name = "rpc-save-upload-metadata")
    String rpcSaveUploadMetadata;
    @JSONField(alternateNames = "save-not-found", name = "save-not-found")
    String saveNotFound;
    @JSONField(alternateNames = "seed-ratio", name = "seed-ratio")
    String seedRatio;
    @JSONField(alternateNames = "seed-time", name = "seed-time")
    String seedTime;
    @JSONField(alternateNames = "split", name = "split")
    String split;
    @JSONField(alternateNames = "stream-piece-selector", name = "stream-piece-selector")
    String streamPieceSelector;
    @JSONField(alternateNames = "timeout", name = "timeout")
    String timeout;
    @JSONField(alternateNames = "uri-selector", name = "uri-selector")
    String uriSelector;
    @JSONField(alternateNames = "use-head", name = "use-head")
    String useHead;
    @JSONField(alternateNames = "user-agent", name = "user-agent")
    String userAgent;


}
